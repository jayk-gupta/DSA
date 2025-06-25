package Arrays.SlidingWindow;

import java.util.HashMap;

// VARIABLE SLIDING WINDOW
public class LongestSubarraySumWithSumK {
    public static void main(String[] args) {
//        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        int[] arr =   {1, 2, 3, -2, 5};

        System.out.println(lenOfLongestSubarr(arr, 5));
    }

    /** Works only for positive numbers **/
    public static int lenOfLongestSubarr(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, max = 0;
        while (j < nums.length) {
//            find sum
            sum += nums[j];
            // Shrink the window from left if sum > k
            while (sum > k && i <= j) {
                sum -= nums[i];
                i++;
            }
//            check if sum == k
            if (sum == k) {
                int window = j - i + 1;
                max = Math.max(max, window);
            }
//           if sum < k move j and keep adding elements
            j++;

        }
        return max;
    }
    /**
     * Works for both positive and negative numbers.
     */
    public static int lenOfLongestSubarray(int[] nums, int k) {
        // Map to store prefix sum -> index
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // Case 1: Entire subarray from 0 to i adds up to k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: Check if there's a subarray ending at i that sums to k
            if (prefixMap.containsKey(sum - k)) {
                int prevIndex = prefixMap.get(sum - k);
                int len = i - prevIndex;
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return maxLen;
    }

}

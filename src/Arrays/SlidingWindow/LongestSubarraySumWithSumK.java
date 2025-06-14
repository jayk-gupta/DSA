package Arrays.SlidingWindow;

public class LongestSubarraySumWithSumK {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2, 3, 5};
        System.out.println(lenOfLongestSubarr(arr, 5));
    }

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

}

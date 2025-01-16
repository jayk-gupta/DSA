package Arrays.SlidingWindow;

public class LongestSubarraySumWithSumK {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,1,1};
        System.out.println(lenOfLongestSubarr(arr, 5));
    }

    public static int lenOfLongestSubarr(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, maxLen = 0;
        // code here
        while (i < nums.length) {
            if (sum < k) {
                if(j> nums.length-1) return maxLen;
                sum += nums[j];
                j++;
            } else if (sum == k) {
//                find current window length
                int len = j - i ;
//                store that if greater than max length
                if (len > maxLen) {
                    maxLen = len;
                }
                sum -= nums[i];
                i++;
            }
            else{
//                sum > k
//                remove element from ith position
                sum-= nums[i];
                i++;
            }
        }
        return maxLen;
    }
}

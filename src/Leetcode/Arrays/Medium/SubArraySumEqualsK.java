package Leetcode.Arrays.Medium;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 1, 1};
        System.out.println(lenOfLongestSubarr(arr, 5));
    }

    public static int lenOfLongestSubarr(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, ans = 0;
        // code here
        while (i < nums.length) {
            if (sum < k) {
                if (j > nums.length - 1) return ans;
                sum += nums[j];
                j++;
            } else if (sum == k) {
                ans++;
                sum -= nums[i];
                i++;
            } else {
//                sum > k
//                remove element from ith position
                sum -= nums[i];
                i++;
            }
        }
        return ans;
    }
}
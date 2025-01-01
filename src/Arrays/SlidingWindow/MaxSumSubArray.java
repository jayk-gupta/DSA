package Arrays.SlidingWindow;
// find max sub array sum with given window size k
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int windowSize = 4;
        System.out.println(maximumSubarraySum(arr, 4));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0, max = Integer.MIN_VALUE;
        while (j < nums.length) {
            if (j < k) {
                sum += nums[j];
                j++;
                max = sum;
            }

            if (j - i == k && j < nums.length) {
                sum = sum - nums[i];
                i++;
                sum += nums[j];
                j++;
            }
            if (sum > max) {
                max = sum;
            }

        }
        return max;
    }
}

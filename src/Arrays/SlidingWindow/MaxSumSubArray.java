package Arrays.SlidingWindow;
// find max sub array sum with given window size k
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int windowSize = 3;
        System.out.println(maximumSubarraySum2(arr, 3));
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
    public static long maximumSubarraySum2(int[] nums, int k) {
        int i = 0, j = 0;
        long sum = 0, max = 0;
        while (j < nums.length) {
            sum+=nums[j];
            if (j - i + 1 == k) {
                if (sum > max) {
                    max = sum;
                }
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return max;
    }
}

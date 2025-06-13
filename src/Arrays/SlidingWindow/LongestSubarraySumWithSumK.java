package Arrays.SlidingWindow;

public class LongestSubarraySumWithSumK {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 1, 2,3,5};
        System.out.println(lenOfLongestSubarr(arr, 5));
    }

    public static int lenOfLongestSubarr(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, max = 0;
        while (j < nums.length) {
            int window = j - i + 1;
            sum += nums[i];
//            check if sum == k
            if (sum == k) {
                if (sum > max) {
                    max = window;
                }
                j++;
            }
            //            check if sum > k
            else if (sum > k) {
                sum -= nums[i];
                i++;
            }
//            check if sum < k
            j++;

        }
        return max;
    }

}

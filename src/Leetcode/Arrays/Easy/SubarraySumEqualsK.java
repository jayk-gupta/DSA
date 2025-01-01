package Leetcode.Arrays.Easy;
//https://leetcode.com/problems/subarray-sum-equals-k/description/
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {5};
        int ans = subarraySum(arr, 5);
        System.out.println(ans);
    }

    public static int subarraySum(int[] nums, int k) {
//        if(k==0) return 0;
        int i = 0, j = 0, sum = 0, count = 0;
        while (i < nums.length) {
            if (sum < k) {
                sum += nums[j];
                j++;
            } else if (sum == k) {
                count++;
                if(j == nums.length) break;
                sum += nums[j];
                j++;

            }
//            sum > k
            else {
                sum -= nums[i];
                i++;
            }
        }
        return count;
    }
}

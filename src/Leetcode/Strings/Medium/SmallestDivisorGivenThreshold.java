package Leetcode.Strings.Medium;

import java.util.Arrays;

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] nums = {21212,10101,12121};

        int threshold = 1000000;
        System.out.println(smallestDivisor(nums, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int ans = 0;
        int end = nums[0];
        for (int num : nums) {
            end = Math.max(end, num);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = calcDivSum(nums, mid);
            if (sum > threshold) {
                start = mid + 1;
            }
//            sum <= threshold
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int calcDivSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }
}

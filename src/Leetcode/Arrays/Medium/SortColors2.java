package Leetcode.Arrays.Medium;

import java.util.Arrays;

public class SortColors2 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int[] ans = new int[nums.length];
        int j = nums.length - 1, k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                ans[j] = 2;
                j--;
            }
            if (nums[i] == 0) {
                ans[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i <=j; i++) {
            ans[i] = 1;
        }
        System.out.println(Arrays.toString(ans));
    }
}

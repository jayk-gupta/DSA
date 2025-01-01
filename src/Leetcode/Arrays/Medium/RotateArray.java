package Leetcode.Arrays.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
        if(nums.length ==1 ) return;
        for (int i = 0; i <k; i++) {
            int temp = nums[0];
            nums[0] = nums[nums.length-1];
            for (int j = nums.length-1; j >1 ; j--) {
                nums[j] = nums[j-1];
            }
            nums[1] = temp;
        }
    }
}

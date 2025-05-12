package Leetcode.Arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        int l = arr.length;
        int r = k % l;
        for (int i = 0; i < k; i++) {

            int temp = arr[l - 1];
            shiftElements(arr, l);
            arr[0] = temp;
        }
    }

    public static void shiftElements(int[] arr, int l) {
        for (int i = 0; i < l - 1; i++) {
            arr[l - i - 1] = arr[l - i - 2];
        }
    }

    //    Optimized
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (k==0) return;
        rotation(nums, 0, k );
        rotation(nums, k + 1, nums.length-1);

        rotation(nums, 0, nums.length-1);
    }

    public static void rotation(int[] nums, int start, int end) {
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

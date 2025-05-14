package Leetcode.Arrays.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates2(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 0, k = 1;
        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                k++;
            } else {
                i++;
            }
        }
        return k;
    }


    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}


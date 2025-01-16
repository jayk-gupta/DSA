package Leetcode.Arrays.Medium;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        rotate2(arr, 12);
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
    public static void rotate2(int[] nums, int k) {

        int len = nums.length;
        k = k%len;
      rotateArray(nums,len-k,len-1);
      rotateArray(nums,0,len-k-1);
      rotateArray(nums,0,len-1);

    }
    public static void rotateArray(int[] nums,int start,int end){
        int i = start, j =end;
        while (i<j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
          j--;
        }
    }
}

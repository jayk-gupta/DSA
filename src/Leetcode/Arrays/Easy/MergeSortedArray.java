package Leetcode.Arrays.Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5, 0, 0, 0}, nums2 = {1,2,3};
        int m = nums1.length, n = nums2.length;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int n1 = m-n-1,n2 = n-1;
         int index = m-1;
        for (int i = 0; i < n; i++) {
            if(nums1[i]>nums2[i]){
                nums1[index] = nums1[i];
//                swap
                nums1[i] = nums2[i];
            }
            else{
                nums1[index] = nums2[i];
            }
            index--;
            n1--;
            n2--;
        }

    }
}

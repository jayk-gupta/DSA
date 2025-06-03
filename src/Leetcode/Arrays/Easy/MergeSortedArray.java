package Leetcode.Arrays.Easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {1, 2, 3};
        int m = 3, n = nums2.length;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1, n2 = n - 1;
        int index = m + n - 1;
        while (n1 >= 0 && n2 >= 0) {
            if (nums1[n1] > nums2[n2]) {
                nums1[index] = nums1[n1];
                index--;
                n1--;
            } else {
                nums1[index] = nums2[n2];
                index--;
                n2--;
            }
        }
        while (n2 >= 0) {
            nums1[index] = nums2[n2];
            index--;
            n2--;
        }

    }
}

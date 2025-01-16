package Leetcode.Arrays.Medium;
//https://leetcode.com/problems/sort-colors/
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,1,0,2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            } else if (nums[mid] == 2) {
//                swap with end
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            } else {
                mid++;
            }
        }

    }
}

package Leetcode.Arrays.Easy;

import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 5};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
//method-1 (mine)
//    find non-zero element and swap it with the currentIndex which tracks the index where next element should be put
    public static void moveZeroes(int[] nums) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
//                swap this element with currentIndex
                int temp = nums[i];
                nums[i] = nums[currentIndex];
                nums[currentIndex] = temp;
                currentIndex++;
            }
        }
    }
//method-2
    public static void moveZeroes2(int[] nums) {
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
//           putting element in current index
                nums[currentIndex] = nums[i];
                currentIndex++;
            }
        }
        System.out.println(currentIndex);
        for (int i = currentIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

package Leetcode.Arrays.practice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1, 12, 9};
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2                                                                                                                                          )
            {
                max2 = max1;
                max1 = nums[i];

            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max2 && nums[i] != max1){
//                max2 = nums[i];
//            }
//        }
        return max2;
    }
}

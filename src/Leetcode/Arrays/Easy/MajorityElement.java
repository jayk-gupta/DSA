package Leetcode.Arrays.Easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                vote++;
            } else {
                if (vote == 0) {
                    majority = nums[i];
                    vote = 1;
                }
                vote--;
            }
        }
        return majority;
    }
}

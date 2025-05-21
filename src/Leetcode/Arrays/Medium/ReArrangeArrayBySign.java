package Leetcode.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans= rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rearrangeArray(int[] nums) {

        int posIndex = 0, negIndex = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
            else{
                ans[negIndex] = nums[i];
                negIndex+=2;
            }

        }
return ans;
    }
}

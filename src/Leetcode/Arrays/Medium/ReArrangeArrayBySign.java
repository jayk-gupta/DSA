package Leetcode.Arrays.Medium;
import java.util.Arrays;

public class ReArrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans= rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
//Brute force
//    create two new arrays
//    store + and - in each
//    create new ans array
//    take one one element from arrays

//    optimized
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

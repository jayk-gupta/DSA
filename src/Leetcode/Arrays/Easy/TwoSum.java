package Leetcode.Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == target-nums[i] && i != j){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int pair = target-nums[i];
            if(map.containsKey(pair) && map.get(pair) != i){
                return new int[] {i,map.get(pair)};
            }
        }
        return new int[] {-1,-1};
    }
}

package Leetcode.Arrays.Medium;
//https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,1,3,2,1};
        List<Integer> ans = majorityElement2(nums);
        System.out.println(ans);

    }

    //    my solution: hashmap
    public static List<Integer> majorityElement(int[] nums) {
//      more than n/3 times
        List<Integer> list = new ArrayList<>();
        int n = nums.length / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
//        find elements that appears more than n/3 time and add to list
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > n) list.add(e.getKey());
        }
        return list;
    }

    //   Optimized: Boyer-Moore Voting Algorithm
    public static List<Integer> majorityElement2(int[] nums) {
//      more than n/3 times
//      3 2 3 1 2 2 3 3
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) count1++;
            else if (nums[i] == candidate2) count2++;
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }

        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) count1++;
            if (nums[i] == candidate2) count2++;
        }
        if(count1> nums.length/3) list.add(candidate1);
        if(candidate2 != candidate1 && count2> nums.length/3) list.add(candidate2);

        return list;
    }


}

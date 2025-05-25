package Leetcode.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
       int[] nums ={2,2,1};
        System.out.println(singleNumber2(nums));
    }
    public static int singleNumber2(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            int freq = 0;
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i] == nums[j]) freq++;
            }
            if(freq==1) return nums[i];
        }
        return -1;
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int num : nums) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (m.get(num) == 1) return num;
        }
        return -1;
    }
}

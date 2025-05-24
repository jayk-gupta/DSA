package Leetcode.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(arr));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int vote = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    majority = nums[i];
                    vote = 1;
                }

            }
        }
        return majority;
    }


    public static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for (var e: map.entrySet()) {
        if(e.getValue() > nums.length/2) return e.getKey();
        }
        return -1;
    }
    public static int majorityElement3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > threshold) return num;
            map.put(num, count);
        }

        return -1;
    }
}

package StriverAZ.Arrays.Easy;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
int[] nums = {1, 2, 5, 3, 1, 2};
ArrayList<Integer> ans = leaders2(nums);
        System.out.println(ans);
    }
    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean leader ;
        for (int i = 0; i < nums.length; i++) {
            leader = true;
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                 leader = false;
                 break;
                }
            }
            if(leader){
                list.add(nums[i]);
            }
        }
        return list;
    }
//    optimal solution
public static ArrayList<Integer> leaders2(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();
   int max = Integer.MIN_VALUE;
    for (int i = nums.length-1; i >=0 ; i--) {
        if(nums[i]> max){
            list.add(nums[i]);
            max = nums[i];
        }
    }
    return list;
}
}

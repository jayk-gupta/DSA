package Leetcode.Arrays.Easy;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,3,1};
        System.out.println(majorityElement2(arr));
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


    public static int majorityElement2(int[] nums) {
        int candidate = nums[0], vote = -1;
        for (int i = 0; i < nums.length; i++) {
            if(vote ==0){
                candidate = nums[i];
                vote++;
            }
            if (nums[i] == candidate) {
                vote++;
            } else {
                vote--;

            }

        }
        return candidate;
    }
}

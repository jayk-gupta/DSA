package Leetcode.Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int num : nums) {
            if(num == 1 ) {
                count++;
                maxCount = Math.max(count,maxCount);
            }
           else {
                count = 0;
            }
        }
        return maxCount;
    }

}

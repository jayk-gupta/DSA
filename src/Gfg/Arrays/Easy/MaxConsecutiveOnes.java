package Gfg.Arrays.Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0, maxOnes = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                ones++;
                maxOnes = Math.max(maxOnes,ones);

            } else {
               ones= 0;
            }
            i++;
        }
        return maxOnes;
    }
}

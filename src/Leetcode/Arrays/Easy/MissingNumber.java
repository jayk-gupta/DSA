package Leetcode.Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
int [] arr = {1,3,0,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            while(nums[i] != i && nums[i] < nums.length  && nums[i] != nums[nums[i]]){
//          swap
                swap(nums,i);
            }
            i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) return j;
        }
        return nums.length;
    }
    public static void swap(int[] nums,int i){
        int temp = nums[nums[i]];
        nums[nums[i]] = nums[i];
        nums[i] = temp;
    }
    public static int missingNumber2(int[] nums){
        int n  = nums.length;
        int sum = (n*(n+1))/2;
        int arraySum = 0;
        for (int i = 0; i < nums.length; i++) {
            arraySum+=nums[i];
        }
        return sum - arraySum;
    }
}

package StriverAZ.Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11};
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] nums) {
        int max1 = nums[0],  max2 = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]> max1){
                max2 = max1;
                max1 = nums[i];
            }
        }
        return max2;
    }
}

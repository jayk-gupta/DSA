package Leetcode.Arrays.Medium;

import Recursion.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum2(nums);
        System.out.println(ans);

    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
// finding sum
                int sum = nums[i] + nums[left] + nums[right];
//                if sum is 0
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

//                    skip duplicates for left
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
//                    skip duplicates for right
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 1;
        while (j < nums.length) {
            int target = -(nums[i] + nums[j]);
            int el3 = BinarySearch(nums, j + 1, target);
            if (el3 != -1) {
                list.add(Arrays.asList(nums[i], nums[j], el3));
            }
            i++;
            j++;
        }
        return list;
    }

    public static int BinarySearch(int[] nums, int start, int target) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return nums[mid];
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

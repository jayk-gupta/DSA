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
        // This will store the final list of triplets that sum to 0
        List<List<Integer>> result = new ArrayList<>();
        // Step 1: Sort the array to enable two-pointer technique
        Arrays.sort(nums);
        // Step 2: Loop through the array
        // We stop at length - 2 because we need at least 3 elements for a triplet
        for (int i = 0; i < nums.length-2; i++) {
            // Step 2a: Skip duplicate values for `i` to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;


            // Step 3: Use two pointers to find remaining two numbers
            int left = i + 1;                  // Start of the subarray
            int right = nums.length - 1;       // End of the subarray
            // Step 4: Move the two pointers toward each other
            while (left < right) {
                // Step 4a: Calculate the sum of the current triplet
                int sum = nums[i] + nums[left] + nums[right];
//              Step 4b: Check if the sum is zero
                if (sum == 0) {
                    // Found a valid triplet, add to result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Move both pointers inward to continue searching
                    left++;
                    right--;

                    // Step 4c: Skip duplicates for `left` pointer
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    // Step 4d: Skip duplicates for `right` pointer
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                } else if (sum < 0) {
                    // Step 4e: If sum is less than 0, move `left` to increase sum
                    left++; // increase sum
                } else {
                    // Step 4f: If sum is greater than 0, move `right` to decrease sum
                    right--; // decrease sum
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

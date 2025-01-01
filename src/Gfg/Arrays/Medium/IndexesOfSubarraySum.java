package Gfg.Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexesOfSubarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list = subarraySum(arr, 15);
        System.out.println(list);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, sum = 0;
        while (j < arr.length) {
            if (sum < target) {
                sum += arr[j];
                j++;
            } else if (sum == target) {
                //add to list indexes
                list.add(i+1);
                list.add(j);
                return list;
//                if (j == arr.length) break;
//                sum += arr[j];
//                j++;

            }
//            sum > k
            else {
                sum -= arr[i];
                i++;
            }
        }
        list.add(-1);
        return list;
    }
}

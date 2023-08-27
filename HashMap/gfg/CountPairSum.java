package HashMap.gfg;

import java.util.HashMap;
// X
// https://practice.geeksforgeeks.org/problems/count-pair-sum5956/1?page=1&category[]=Hash&sortBy=difficulty
public class CountPairSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 5, 8};
        int sum = 10;
        int ans = countPairs(arr1, arr2, arr1.length, arr2.length, sum);
        System.out.println(ans);
    }
// solve later using hash table
    public static int countPairs(int arr1[], int arr2[], int M, int N, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < M; i++) {
            map.put(arr2[i], 1);
        }
        for (int i = 0; i < N; i++) {
            if (map.containsKey(x-arr1[i])){
                count ++;
            }
        }
        return count;
    }


//    Brute force
//    public static int countPairs(int arr1[], int arr2[], int M, int N, int x) {
//        int count = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] + arr2[j] == x) count++;
//            }
//        }
//        return count;
//    }
}

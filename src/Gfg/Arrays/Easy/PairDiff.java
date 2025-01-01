package Gfg.Arrays.Easy;

import java.util.HashMap;

public class PairDiff {
    public static void main(String[] args) {
        int[] arr = {2 ,5 ,3 ,10};
        int x = 8;
        System.out.println(findPair(arr, x));
    }

    public static boolean findPair(int[] arr, int x) {
        if(x==0) return false;
        // code here
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            int target = x + arr[i];
            if (m.containsKey(target) && m.get(arr[i]) != arr[i]) {
                return true;
            }
        }
        return false;
    }
}

package Gfg.Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}, b = {1, 2, 3, 6, 7};
        ArrayList<Integer> l = new ArrayList<>(findUnion(a,b));
        System.out.println(l);
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//       ArrayList<Integer> list = new ArrayList<>();
//        // add your code here
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            map.put(a[i], 1);
//        }
//        for (int i = 0; i < b.length; i++) {
//            map.put(b[i], 1);
//        }
//        list.addAll(map.keySet());
//        return list;
        // Use a HashSet to ensure uniqueness
        HashSet<Integer> set = new HashSet<>();

        // Add elements of both arrays to the set
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }

        // Convert the set to an ArrayList
        return new ArrayList<>(set);
    }
}

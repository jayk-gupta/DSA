package Leetcode.Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Store {
    public static void main(String[] args) {
        String[] orders = {"s1p2", "s3p2", "s1p5", "s1p1", "s3p9"};
        HashMap<String, List<String>> m = new HashMap<>();
        for (String order : orders) {
            String[] parts = order.split("(?<=\\d)(?=[a-zA-Z])");
            String store = parts[0], product = parts[1];
            if (!m.containsKey(store)) {
                m.put(store, new ArrayList<>());
            }
            m.get(store).add(product);
        }
        System.out.println(m);
//        individual cost = 3 unit
//        multiple product,same store cost = 9
//        multiple product same store cost = 9
        int totalCost = 0;
        for (var e : m.entrySet()) {
            int NumberOfProducts = e.getValue().size();
            if (NumberOfProducts < 3) {
                totalCost += NumberOfProducts * 3;
            } else {
                totalCost += 9;
            }
        }
        System.out.println(totalCost);
    }
}

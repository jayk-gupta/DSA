package Leetcode.Strings.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfBeautyOfSubstring {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }

    public static int beautySum(String s) {
        List<String> substrings = new ArrayList<>();
//        min length 3
        for (int i = 0; i <= s.length() - 3; i++) {
            for (int j = s.length() - 2 + i; j <= s.length(); j++) {
                substrings.add(s.substring(i, j));
            }
        }
        System.out.println(substrings);
        return 1;
    }

    public static int beauty(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (char c : chars) {
            int count = m.getOrDefault(c, 0) + 1;
            m.put(c, count);
        }
        return 1;
    }
}

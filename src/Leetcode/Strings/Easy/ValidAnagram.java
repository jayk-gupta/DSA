package Leetcode.Strings.Easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaran";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int freq = m.getOrDefault(c, 0) + 1;
            m.put(c, freq);
        }
        for (int i = 0; i < t.length(); i++) {
            Character a = t.charAt(i);
//            tries to get the frequency of the char
//            if not found use default 0 + 1
            int freq = m.getOrDefault(a, 0);
            if (freq == 0) return false;
            m.put(a,freq-1);

        }
        return true;
    }
}

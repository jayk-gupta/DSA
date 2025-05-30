package Leetcode.Strings.Easy;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {
    public static void main(String[] args) {
        String s = "badc", t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Character> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character s1 = s.charAt(i), s2 = t.charAt(i);
            if (m.containsKey(s1)) {
                if (m.get(s1) != s2) {
                    return false;
                }
            } else {
                if(m.containsValue(s2)){
                    return false;
                }
                m.put(s1, s2);
            }
        }
        return true;
    }
}

package Leetcode.Strings.Easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
/*
* You're not comparing every pair of strings or all combinations (which would be O(n²)).
You're scanning at most minLen characters in n strings — so total work is: O(n × minLen) = O(S)
* */

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
        for (String s : strs) {
            minLen = Math.min(minLen, s.length());
        }
        for (int i = 0; i < minLen; i++) {
            char prefix = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != prefix) {
                    return result.toString();
                }
            }
            result.append(prefix);
        }
        return result.toString();
    }
}



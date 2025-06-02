package Leetcode.Strings.Easy;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        return s.concat(s).contains(goal);
    }
}

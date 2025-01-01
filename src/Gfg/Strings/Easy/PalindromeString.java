package Gfg.Strings.Easy;

public class PalindromeString {
    public static void main(String[] args) {
        String s= "y8oy8a";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
        // code here
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

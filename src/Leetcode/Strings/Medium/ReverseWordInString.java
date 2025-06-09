package Leetcode.Strings.Medium;

import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        System.out.println(reverseWords2(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int i = 0, j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", words);
//        time: O(n), space: O(n)
    }

    public static String reverseWords2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            System.out.println(sb);
            if (i != 0) {
                sb.append(" ");
            }

        }
        return sb.toString();
        //        time: O(n), space: O(n)
    }
}

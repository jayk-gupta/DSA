package Gfg.Strings.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " i  aaa bb cc";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        // Code here
      String[] words =   s.strip().split(" ");
        for (int i = 0; i < words.length/2; i++) {
           String temp = words[i];
           words[i] = words[words.length-i-1];
            words[words.length-i-1] = temp;
        }

        String ans = String.join(" ",words);
        return ans;
    }
}

package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Ritika";
        String nam = "Jay";
        System.out.println(name.charAt(0)); // R
        System.out.println(name.charAt(4)); //k

// CompareTo: The method compares the characters of the two strings one by one, starting from the first character.
//It stops at the first differing character and calculates the difference in their Unicode values.
        System.out.println(name.compareTo(nam)); //8 : R-j = 82 - 74 = 8
// Concat
        System.out.println(name.concat(nam)); //RitikaJay
//  Contains
        System.out.println(name.contains("Rio")); //false
//  Split: The split stops after producing 2 substrings, and the remainder is included in the last substring.
        String[] splitStr = name.split("i",2); // [R,tika]
        System.out.println(Arrays.toString(splitStr)); // R,t,ka (without limit)
// Replace
        System.out.println(name.replace("i","I"));
// Strip: remove spaces trailing leading
        String str ="     geirgeoieho            ";
        System.out.println(str);
        System.out.println(str.strip());
//
        System.out.println(name.substring(0,3)); // 012: Rit
    }
}

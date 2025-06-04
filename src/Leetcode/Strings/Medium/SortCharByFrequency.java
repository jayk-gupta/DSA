package Leetcode.Strings.Medium;

import java.util.*;

public class SortCharByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int count = map.getOrDefault(chars[i], 0) + 1;
            map.put(chars[i], count);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            char c = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++) {
                sb.append(c);
            }

        }
        return sb.toString();
    }
//    Bucket Sort
    public static String frequencySort2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            int count = map.getOrDefault(chars[i], 0) + 1;
            map.put(chars[i], count);
        }
        List<Character>[] buckets = new List[chars.length+1];
        return "";
    }
}

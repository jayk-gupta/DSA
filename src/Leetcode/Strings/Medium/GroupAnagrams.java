package Leetcode.Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"abc", "bca", "cab", "xyz", "zyx"};
//        Output: [["abc","bca","cab"],["xyz","zyx"]]
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
//           check in hashmap if key of word exists
            // If the key doesn't exist, create new list
            if (!m.containsKey(sortedWord)) {
                m.put(sortedWord, new ArrayList<>());
            }
            // Add the original word to the correct anagram group
            m.get(sortedWord).add(str);
            System.out.println(m.get(sortedWord));
        }
        // Return all the grouped anagram lists
        return new ArrayList<>(m.values());
    }
}

/*
m.values()
This returns a Collection of all the values in the map m.
In this case, m is a HashMap<String, List<String>>, so m.values() gives you a Collection<List<String>>.
That means: all the grouped anagram lists (without the keys).

Why wrap it in new ArrayList<>()?
Because m.values() returns a Collection, but your function needs to return a List<List<String>> (as declared in the method signature).

So, new ArrayList<>(...) simply converts that Collection to an ArrayList, which matches the return type and ensures a proper list structure.
 */
package Gfg.Strings.Easy;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c1= s.charAt(i);
            Character c2= t.charAt(i);
            if(!map.containsKey(c1)){
//            if it does not contain
//                also check if there exists same value
                if(map.containsValue(c2)){
                    return false;
                }
                map.put(c1,c2);
            }
//            if contains
            else{
//                check if value is same if not return false
                if(map.get(c1) != c2) return false;
            }
        }
        return true;
    }
}

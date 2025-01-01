//package Leetcode.Strings.Easy;
//
//import java.util.HashMap;
//
//public class LongPressedName {
//    public static void main(String[] args) {
//        String name = "alex", typed = "alexx";
////        System.out.println(isLongPressedName(name, typed));
////    }
//
////    public static boolean isLongPressedName(String name, String typed) {
////
////        HashMap<Character, Integer> map = new HashMap<>();
////        for (int i = 0; i < name.length(); i++) {
////            char c = name.charAt(i);
////            if (map.containsKey(c)) {
////                map.put(c, map.get(c) + 1);
////            } else {
////                map.put(c, 1);
////            }
////        }
////        for (int i = 0; i < typed.length(); i++) {
////            char c = typed.charAt(i);
////            if(map.containsKey(c)){
////
////                map.put(c, map.get(c) - 1);
////                if(map.get(c)  == -1) return true;
////            }
////        }
////        return false;
////    }
////}

package Gfg.Arrays.Easy;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 3, 2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr) {
        // your code here
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        for(Integer key : m.keySet()){
            if(m.get(key) > arr.length/2){
                return key;
            }
        }
        return -1;
    }
}

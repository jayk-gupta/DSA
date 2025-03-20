package OOPS.CollectionsFramework;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
//        vectors are not synchronized
//        multiple threads cannot use it at same time, one has to wait for the other to finish it's task
        List<Integer> vector = new Vector<>();

//        Enums
//
    }
}

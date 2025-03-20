package OOPS.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(25, "kunal");
//        lengthy method, lot overhead
//        Human twin = new Human(kunal);

        Human twin = (Human)kunal.clone();
//        shallow copy
//        clone will copy the values
//        faster way to do
        System.out.println(twin.age +" "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 45;
        twin.name = "Rahul";
//        kunal's arr is also changed because it is shallow copy
//       point to the same reference for non-primitive:array
        System.out.println(Arrays.toString(kunal.arr));
        System.out.println((kunal.name));
    }
}

package OOPS.Bascis;

public class WrapperExample {
    public static void main(String[] args) {
        int c = 10;
        Integer num = 4;

//  Now it is created as an object,
//  wrapper class has many properties which we can use
        System.out.println(num.toString());
//        pass by reference
        Integer a = 10;
        Integer b = 20;
//        It is not swapped bcoz Integer is final
        System.out.println(a + " " + b);
// final keyword
//        final variable have to be initialized
        final int INCREMENT = 20;
//        INCREMENT = 30;
//    But final works for primitive type only: you cannot change the value in primitive data-type
//    For non-primitives the variable will point to the same object
//    but the value of object can change
        final Student kunal = new Student();
//     you can make the change in value
        kunal.name = "KUNAL";
//      you cannot re-assign it
//        kunal = new Student();
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}



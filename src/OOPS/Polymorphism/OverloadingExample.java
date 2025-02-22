package OOPS.Polymorphism;

public class OverloadingExample {
//    Compile time polymorphism
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, String b) {
        return a;
    }

    int sum(int a, int b, int c) {
        return a + b;
    }

    int sum(int a, int b, String operation) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.sum(2,3);
        obj.sum(2,"3");
        obj.sum(2,3,6);
//        obj.sum(2); this method does not exist
    }
}

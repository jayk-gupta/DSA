package OOPS.Interfaces.NestedInterfaces;

public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements  A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.isOdd(5);
    }
}
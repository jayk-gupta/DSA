package OOPS.Interfaces.DefaultInterface.ExtendInterfaces;

public class Main implements A,B {

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
//        call via the interface name
        A.greeting();
    }
}

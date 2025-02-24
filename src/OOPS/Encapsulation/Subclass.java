package OOPS.Encapsulation;

import OOPS.AccessModifier.A;

public class Subclass extends A {
//    Subclass outside of package can access the protected stuff
    public Subclass(int num, String name) {
        super(num, name);

    }

    public static void main(String[] args) {
        Subclass s= new Subclass(2,"f");
        System.out.println(s instanceof Object);
    }
}

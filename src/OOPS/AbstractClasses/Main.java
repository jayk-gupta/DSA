package OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Son s = new Son(23);
        s.career();
        s.normal();
        Daughter d = new Daughter(16);
        d.career();
        Parent.hello();
//        cannot create objects of an abstract class
//        Parent father = new Parent();

//        we have to override in order to create object
        Parent mother = new Parent(45) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
    }

}

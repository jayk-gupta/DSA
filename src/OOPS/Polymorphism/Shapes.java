package OOPS.Polymorphism;

public class Shapes {

// final : cannot override method that is final
//    early binding: final method cannot be overridden
 void area(){
     System.out.println("I am in shapes");
 }
}
//if a class is declared final it's method will also be implicity final
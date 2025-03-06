package OOPS.Interfaces.DefaultInterface.ExtendInterfaces;

public interface A {

    //    static methods do not depend on object , they cannot be inherited
//    static method  cannot be inherited -> cannot be overidden
//    it means they should have a body
//    static interface method should always have a body
    static void greeting() {

    }

    //    from jdk can give default implementation
  default void fun(){
        System.out.println("I am in A");
    }
    default void fun2(){
        System.out.println("I am in A");
    }
}

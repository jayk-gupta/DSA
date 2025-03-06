package OOPS.AbstractClasses;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("can create static methods");
    }

    void normal() {
        System.out.println("normal method");
    }
//    abstract constructor not allowed
//    abstract  Parent(){
//
//    }

    abstract void career();

    abstract void partner();
}
//If you definitely know that function in the parent class needs to be overidden just make functions abstract
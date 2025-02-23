package OOPS.Inheritance;

public class Box {
//  encapsulation: hide the complexity of the system
//  data hiding : data security
   private double l;
    double h;
    double b;
    double weight;

// All the static methods are inherited
//    Method in parent class will always run no matter from which object you call it
//    Bcoz it does not depend on object
    static void greeting(){
        System.out.println("I am in box. Greetings!!");
    }


    public Box(double l, double h, double b) {
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public Box() {
//        super(); referring to Object class
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.b = old.b;
    }

    public void info() {
        System.out.println("in box class");
    }

    public double calcVol() {
        return this.l * this.b * this.h;
    }
}

package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double b;
    double weight;

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

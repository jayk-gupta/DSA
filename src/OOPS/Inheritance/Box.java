package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double b;

    public Box(double l, double h, double b) {
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public Box() {
        this.l = l;
        this.h = h;
        this.b = b;
    }

    public Box(double l) {
        this.l = l;
        this.b = l;
        this.h = l;
    }
    Box(Box old){
        this.l = old.l ;
        this.h = old.h;
        this.b = old.b;
    }
    public void info(){
        System.out.println("in box class");
    }
    public double calcVol(){
        return this.l*this.b*this.h;
    }
}

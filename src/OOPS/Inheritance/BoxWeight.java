package OOPS.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;

    }

    BoxWeight(double side, double weight) {
        super(side);
    }

    public BoxWeight(double l, double h, double b, double weight) {
//       l,h,b: call the parent class constructor
//        used to initialize values present in parent class
//        here Box class constructor is called
//If we don't call this, default one will be called then
        super(l, h, b);
        //        super can be used to access the variables of parent
//        Parent also has weight and child also so there we use super keyword
//        to access the parent variable
        System.out.println(super.weight);
        this.weight = weight;
    }
}

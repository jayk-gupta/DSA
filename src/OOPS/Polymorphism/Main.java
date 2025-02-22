package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle c = new Circle();
        Square s = new Square();
//   Since the type is of square it will call square method
//   left side variable decides what can be accessed
//   right(type of object) one decides what version to return
        Shapes sq = new Square();
        sq.area();
        shape.area();
        c.area();
        s.area();
    }
}

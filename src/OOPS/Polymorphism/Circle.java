package OOPS.Polymorphism;

public class Circle extends  Shapes{
//   annotation: to check if method is overridden or not
    @Override
//    this will run when object of circle is created, hence it will override the parent one
    void area(){
        System.out.println("Area is 3.14*r*r");
    }
}

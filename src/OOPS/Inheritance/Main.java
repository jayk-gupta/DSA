package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box(2,3,4);
//        System.out.println(b.l);
//        System.out.println(b.h);
//        System.out.println(b.b);
//        System.out.println(b.calcVol());
//    BoxWeight b1 = new BoxWeight();
//    BoxWeight b2 = new BoxWeight(2,3,4,2);
//        System.out.println(b1.weight);
        Box box3 = new BoxWeight(2,3,4,19);
        System.out.println();


//        BoxWeight box4 = new Box(2,3,4);j

        BoxPrice box = new BoxPrice(5,200,4);
   Box.greeting(); // you can inherit but you cannot override

    }
}
// parent will not be able to access the child properties
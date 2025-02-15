package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b = new Box(2,3,4);
        System.out.println(b.l);
        System.out.println(b.h);
        System.out.println(b.b);
        System.out.println(b.calcVol());
    }
}

package OOPS.Bascis.Static;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
//       Only runs ONCE when the first object is created
//        i.e when the class is loaded for the first time
        System.out.println("In static block");
        b = a + 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

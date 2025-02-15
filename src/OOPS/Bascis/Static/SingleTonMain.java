package OOPS.Bascis.Static;

public class SingleTonMain {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
    }
}

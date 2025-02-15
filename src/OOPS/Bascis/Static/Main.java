package OOPS.Bascis.Static;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(24, "kunal", 45000, false);
        Human jay = new Human(23, "jay", 50000, false);
        System.out.println(Human.population); //2
        System.out.println(jay.population); //2
        System.out.println(kunal.population); //2
//greeting(); cannot call non-static stuff in static method
        fun();
    }

    //    static doesn't require an object instance
    static void fun() {
//        greeting is non-static, it requires an instance
//        But fun doesn't require an instance
//        We cannot access non-static stuff in static one
//        greeting();
//        hence in order to use greeting which is non-static
//        we need to create an object first

        Main obj = new Main();
        obj.greeting();
        obj.fun2();
    }

    //    Something which is not static belongs to an object
    void greeting() {
        System.out.println("hi");
    }
//    Everything in the end will be called in static method
//    Main method
//    So we know that an object for fun2 will be created
//    that is why we can call greeting in fun2

    void fun2() {
        greeting();
    }
}




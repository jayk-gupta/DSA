package OOPS.Bascis.Static;

// Outside classes cannot be static
// It is not dependent on any class
public class InnerClasses {
    //    only inner classes can be static
//    After adding static to inner Test class, now it is not dependent on the objects of InnerClass
//  Main and Test can have instances of each other
//    static means it is not dependent on Inner Class
//    Internally it can have it's objects
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
//        Over-riding toString method
//        @Override
//        public String toString(){
//            return name;
//        }
    }

    public static void main(String[] args) {
        Test a = new Test("a");
        Test b = new Test("b");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
    }
}
//NOTE
// Static stuff is resolved at runtime
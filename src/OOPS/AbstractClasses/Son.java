package OOPS.AbstractClasses;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }
//    Can't create abstract static methods and constructors
    //    All the child classes would have to override these methods
//    Abstract methods in parent
    @Override
    void career() {
        System.out.println("I am going to be engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Ritika and she is 21 years old");
    }

 @Override
        void normal(){
            super.normal();
        }
}

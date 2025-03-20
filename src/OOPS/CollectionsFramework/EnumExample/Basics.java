package OOPS.CollectionsFramework.EnumExample;

public class Basics {
//  enum can implement interfaces
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        these are enum constants
//        public static and final
//        since is final you can't create child enums
//        type is Week

//        constructor
//        this is not public or protected, only private or default
// reason: it will allow initialisation of more objects if public
//        we don't want more objects as enum as fixed constants
    Week() {
        System.out.println("Constructor called for " + this);
    }
        @Override
        public void hello() {
            System.out.println("hello");
        }
//    internally it works like this
//    public static final Week Monday = new Week();
}

    public static void main(String[] args) {
        Week week;
        week = Week.Friday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
        for (Week day : Week.values()) {
            System.out.println(day);
        }
//        position in enum
        System.out.println(week.ordinal());
    }

}

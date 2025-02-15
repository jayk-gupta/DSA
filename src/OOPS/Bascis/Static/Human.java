package OOPS.Bascis.Static;

//static: object independent property
// Single property common to ALL OBJECTS of tha class
public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("hi");
//  Cannot use this keyword inside static as it is independent of object
//        System.out.println(this.age);

    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }
}
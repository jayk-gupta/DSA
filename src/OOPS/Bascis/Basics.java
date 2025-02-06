package OOPS.Bascis;

public class Basics {
    public static void main(String[] args) {
        Student s1 = new Student();
//        () default constructor
        s1.name = "jay";
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);
//        constructor with args
        Student s2 = new Student(32,"Ritika",98);
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.marks);
//   constructor with other object as arg
        Student s3= new Student(s2);
        System.out.println(s3.name);
        System.out.println(s3.rno);
        System.out.println(s3.marks);
    }

}

class Student {
    int rno;
    String name;
    float marks;

    void greet() {
        System.out.println("my name is:"+ this.name);
    }
//    constructor taking other Object as argument
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
//constructor
    Student() {
//        this.rno = 0;
//        this.marks = 70;
//        this.name = "student";
//        calling a constructor from another constructor
//        internally : Student(12,"default student",54);
        this(12,"default student",54);
    }
//    constructor with arguments
    Student(int  rno, String name, float marks) {
        this.rno = rno;
        this.marks = marks;
        this.name =name;
    }
}


package OOPS.Bascis.ComparingObjects;

public class Main {
    public static void main(String[] args) {
        Student Jay = new Student(2,79.43f);
        Student Jasmine = new Student(1,98.7f);

        if(Jay.compareTo(Jasmine) < 0){
            System.out.println("Jasmine has more marks");
        }
    }
}

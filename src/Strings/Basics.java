package Strings;

public class Basics {
    public static void main(String[] args) {
        String name = "jay";
        String nam = "jay";
        String naam = new String("jay");
        System.out.println(name==nam); // true: pointing to the same object
        System.out.println(name == naam); // false: diff objects
        System.out.println(name.equals(naam)); // .equals only checks the value not object so true

        System.out.println("a"+"b"); //ab
        System.out.println("a"+'v'); //av
        System.out.println(2+"b"); // 2b
        System.out.println('a'+1); //98
        System.out.println('a'+1+"a"); //98a
    }
}

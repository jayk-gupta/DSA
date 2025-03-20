package OOPS.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override (Shallow copy)
//    public Object clone() throws CloneNotSupportedException{
////        this is shallow copy
//        return super.clone();
//    }    @Override


    //    Deep copy
    public Object clone() throws CloneNotSupportedException {
//        this is shallow copy
        Human twin = (Human) super.clone();
//      deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}

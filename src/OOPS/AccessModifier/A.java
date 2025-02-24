package OOPS.AccessModifier;

public class A {
//    private means private to this file
//    you can access it anywhere in this file
  private  int num;
//  Don't specify any access modifier
//    available in this package only
    String name;
    int[] arr;
// this method is public so can be accessed from anywhere
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

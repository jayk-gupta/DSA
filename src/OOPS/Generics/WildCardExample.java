package OOPS.Generics;

import java.util.Arrays;
import java.util.List;

// you can add the class Number or the sub-class of Number
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    //    wildcard
//        you can pass only number type
//    public void getList(List<Number> list){
//    pass subclass also float integer
    public void getList(List<? extends Number> list) {
//        do something

    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public T remove() {
//        reducing the size and not deleting the element
//        on adding next element will override the element
        T removed = (T) data[--size];
        return removed;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
//        copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        OOPS.Generics.CustomArrayList list = new OOPS.Generics.CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);

        WildCardExample<Number> list3 = new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(i * 2);
        }
        System.out.println(list3);
//            list3.add("hg"); error
    }
}
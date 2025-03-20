package OOPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return data[index];
    }
    public void set (int index,int value){
        data[index] = value;
    }
    public int remove() {
//        reducing the size and not deleting the element
//        on adding next element will override the element
        int removed = data[--size];
        return removed;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
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
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
// ArrayList<Integer>
//Generics help in giving a type to these values
//parameterized type
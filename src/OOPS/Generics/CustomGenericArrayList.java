package OOPS.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public CustomGenericArrayList() {
            this.data = new Object[DEFAULT_SIZE];
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
            return (T)data[index];
        }
        public void set (int index,T value){
            data[index] = value;
        }
        public T remove() {
//        reducing the size and not deleting the element
//        on adding next element will override the element
            T removed = (T)data[--size];
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
            CustomGenericArrayList<Integer> list3= new CustomGenericArrayList<>();
            list3.add(6);
            list3.add(5);
            list3.add(1);
            System.out.println(list3);
//            list3.add("hg"); error
        }
    }

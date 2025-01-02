package Arrays.Sorting;

import java.util.Arrays;

//select largest element and put it at it's correct  index
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           int max = findMax(arr, i);
           int temp = arr[max];
           arr[max]= arr[arr.length-i-1] ;
            arr[arr.length-i-1] = temp;
        }
    }

    static int findMax(int[] arr, int index) {
        int max = Integer.MIN_VALUE, maxIndex=0;
        for (int i = 0; i < arr.length - index - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

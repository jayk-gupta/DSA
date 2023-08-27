package HashMap.gfg;

import java.util.HashMap;
// SOLVED
//https://practice.geeksforgeeks.org/problems/count-number-of-elements-between-two-given-elements-in-array4044/1?page=1&category[]=Hash&sortBy=difficulty

public class NumberOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 2, 1, 10, 6, 6, 6};
        int num1 = 4;
        int num2 = 6;
        System.out.println(getCount(arr, arr.length, num1, num2));
    }

    //    solved self half
    static int getCount(int arr[], int n, int num1, int num2) {
        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == num1) {
                break;
            }
        }
        if (i > n - 1) return 0;
        for (j = n - 1; j >= i + 1; j--) {
            if (arr[j] == num2) {
                break;
            }
        }
        if (j == i) return 0;

        return j - i - 1;
    }
}

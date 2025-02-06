package Leetcode.Arrays.Medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3,4}, {5, 6, 7,8}, {9, 10, 11,12}};
        System.out.println(matrix.length);
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    public static void rotate(int[][] matrix) {
//        find transpose of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//        reverse each row
        for (int i = 0; i < matrix.length; i++) {
            revRow(matrix[i]);
        }
    }

    static void revRow(int[] row) {
        int i=0,j= row.length-1;
        while (i<j){
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;
            j--;

        }

    }
}

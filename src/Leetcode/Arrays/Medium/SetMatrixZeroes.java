package Leetcode.Arrays.Medium;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) { // Rows
            for (int j = 0; j < matrix[i].length; j++) { // Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] matrix) {
//     set row and col zero if u if u find a zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    setRowColZero(matrix, i,j);
                }

            }
        }
    }

    public static void setRowColZero(int[][] matrix, int row,int col) {
//        row
        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }
//        col
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][col] = 0;
        }
    }
}

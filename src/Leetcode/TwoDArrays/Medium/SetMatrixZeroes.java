package Leetcode.TwoDArrays.Medium;

public class SetMatrixZeroes {
    public static void main(String[] args) {
       int[][] matrix = {
               {1,1,1},
               {1,0,1},
               {1,1,1}};
       setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] ==0){
//                    set row and col to zero
               setRowColZero(matrix,i,j);
                }
//                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void setRowColZero(int[][] matrix ,int row,int col){
//        set row zero
        for (int j = 0; j < matrix[row].length; j++) {
            matrix[row][j] =0 ;
        }
        for (int i = 0; i <matrix.length ; i++) {
            matrix[i][col] = 0;
        }
    }
}

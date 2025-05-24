package Leetcode.Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
//        Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        List<List<Integer>> list = generate2(5);
        System.out.println(list);
    }
// code written by me
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(numRows ==1) return result;
        List<Integer> secondRow = new ArrayList<>();
        secondRow.add(1);
        secondRow.add(1);
        result.add(secondRow);
//     generate row logic
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int k=0,j=1;
            while (j<i){
                int el =  result.getLast().get(k) + result.getLast().get(j);
                row.add(el);
                k++;
                j++;
            }
            row.addLast(1);
            result.add(row);
        }
        return result;
    }
//    optimized
    public static List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = result.get(i - 1);
                int val = prevRow.get(j - 1) + prevRow.get(j);
                row.add(val);
            }

            if (i > 0) row.add(1); // Last element is also 1 (except for the first row)

            result.add(row);
        }

        return result;
    }
}

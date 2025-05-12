package StriverAZ.Arrays.Easy;

public class LargestElementInArray {
    public static void main(String[] args) {

        int[] arr = {4,6,-2,10,-6,14,11};
        System.out.println(findLargestElement(arr));

    }
    public static int findLargestElement(int[] arr){
      int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

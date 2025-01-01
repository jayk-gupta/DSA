package Gfg.Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,10,10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        if(arr.length==1) return arr[0];
        int largest = arr[0], secondLargest = -1;
        // Code Here
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i]>secondLargest){
                secondLargest =arr[i];
            }
        }
        return secondLargest;
    }
}

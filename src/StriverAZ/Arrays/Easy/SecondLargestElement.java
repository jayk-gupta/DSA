package StriverAZ.Arrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
//        System.out.println(findSecondLargestElement(arr));
        System.out.println(findSecondLargest(arr));

    }
    public static int findSecondLargestElement(int[] arr){
        int max = 0;
        int max2 = 0;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : arr) {
            if (j > max2 && j != max) {
                max2 = j;
            }
        }
        return max2;
    }
    public static int findSecondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest= arr[i];
            }
//            number greater than secondLargest but less than largest and isn't duplicate of largest
            else if(arr[i] > secondLargest && arr[i] != largest){
                    secondLargest = arr[i];
                }
        }
//        no second largest element exists, all elements are same
        if(secondLargest == Integer.MIN_VALUE) return -1;
        return secondLargest;
    }
}
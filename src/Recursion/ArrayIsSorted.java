package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {
int[] arr = {1,2,3,5,6,7,11};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index]> arr[index+1]){
            return false;
        }
        else{
        return isSorted(arr,index+1);
        }
    }
}

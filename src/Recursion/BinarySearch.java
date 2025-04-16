package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 12, 24, 32, 41};
        int target = 32;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
//        mid
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        }
        return search(arr, target, mid + 1, end);
    }
}

// return type of calling the recursive function
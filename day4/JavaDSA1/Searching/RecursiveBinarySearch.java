package day4.javadsa1.searching;

public class RecursiveBinarySearch {
    static int RBS(int arr[], int left, int right, int target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return RBS(arr, left, mid - 1, target);
            }
            return RBS(arr, mid + 1, right, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 4;
        int left = 0;
        int right = arr.length - 1;
        int result = RBS(arr, left, right, target);
        if(result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found in the array. Index is " + result);
        }
    }
}

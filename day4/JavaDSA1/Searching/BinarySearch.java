package day4.JavaDSA1.Searching;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int[] arr = new int[10];
        System.out.print("Enter array values: ");
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        int mid = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (found) {
            System.out.println("Element found in the array. Index is " + mid);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

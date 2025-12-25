package day4.JavaDSA1.Programs;

// Adding 1 to a number represented as an array and contains only single digit elements

public class add1toArray {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int n = arr.length;
        int carry = 1;
        for(int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
            if(carry == 0) {
                break;
            }
        }
        if(carry > 0) {
            System.out.print(carry + " ");
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

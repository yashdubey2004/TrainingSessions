package day4.JavaDSA1.Programs;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 89, 12, 90, 45};
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}

package day4.JavaDSA1.Programs;

public class LargestThree {
    public static void main(String[] args) {
        int[] arr = {34, 67, 23, 89, 12, 90, 45};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] < first){
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third && arr[i] < second){
                third = arr[i];
            }
        }
        System.out.println("First number is " + first);
        System.out.println("Second number is " + second);
        System.out.println("Third number is " + third);
    }
        

}

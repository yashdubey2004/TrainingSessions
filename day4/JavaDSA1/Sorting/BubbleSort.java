package day4.JavaDSA1.Sorting;

public class BubbleSort {
    public static void main(String[] args){ 
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        for(int i = 1; i < arr.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}



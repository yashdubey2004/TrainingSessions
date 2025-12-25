package day4.JavaDSA1.Programs;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left <= right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");   
    }
}
}
    

package day4.JavaDSA1.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 12, 12, 22, 11};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            if(mini == i) continue;
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

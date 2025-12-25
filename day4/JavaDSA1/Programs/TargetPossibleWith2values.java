package day4.JavaDSA1.Programs;

import java.util.HashMap;

public class TargetPossibleWith2values {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 15;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Target " + target + " is possible with values: " + arr[i] + " and " + complement);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Target " + target + " is not possible with any two values in the array.");
    }
}

package day4.JavaDSA1.Programs;

public class LargestSumSubarray {
    public static void main(String[] args) {
        int [] arr = {3,8,2,6,9,10,4};
        int w = 3;
        int maxsum = 0;
        int left = 0, right = left + w;
        for(int i = 0; i < w; i++){
            maxsum += arr[i];
        }
        while(right < arr.length){
            int currsum = maxsum - arr[left] + arr[right];
            left++;
            right++;
            if(currsum > maxsum){
                maxsum = currsum;
            }
        }
        System.out.print(maxsum);
    }
}

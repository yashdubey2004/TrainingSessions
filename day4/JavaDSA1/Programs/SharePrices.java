package day4.JavaDSA1.Programs;

// display the maximum profit that can be achieved from the given share prices and buy and sell prices.

public class SharePrices {
    public static void main(String[] args) {
        int[] prices = {7,3,0,2,5,8,1};
        int maxi = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i-1] == 0) continue;
            if(prices[i] > prices[i-1]){
                result += prices[i] - prices[i-1];
            }
            if(prices[i] > maxi){
                maxi = prices[i];
            }
        }    
        System.out.println(result);
        System.out.println(maxi);
        System.out.println(maxi - result);
}
}

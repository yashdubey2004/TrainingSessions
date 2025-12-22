package day2.Demo2.someCodes;

public class biggestNumber {
    public static void main(String[] args) {
        int a = 67, b = 87, c = 84;
        if(a >= b && a >= c){
            System.out.println("Biggest number is a: " + a);
        } else if(b >= a && b >= c){
            System.out.println("Biggest number is b: " + b);
        } else{
            System.out.println("Biggest number is c: " + c);
        }
    }
}

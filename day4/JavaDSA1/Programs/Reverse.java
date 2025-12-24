package day4.JavaDSA1.Programs;
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be reversed: ");
        int num = sc.nextInt();
        int sign = 1;
        if(num < 0){
            sign = -1;
            num = num * (-1);
        }
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result = (result * 10) + rem;
            num = num / 10;
        }
        if(sign == -1){
            result *= (-1);
        }
        System.out.println("Reversed number is " + result);
    }
}

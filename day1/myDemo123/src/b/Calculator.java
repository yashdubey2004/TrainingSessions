package b;
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int choice = sc.nextInt();
        System.out.println("Enter first number:");
        float a = sc.nextFloat();
        System.out.println("Enter second number:");
        float b = sc.nextFloat();
        Maths mn = new Maths();
        if(choice == 1){
            mn. add(a, b);
        }
        else if(choice == 2){
            mn. subtract(a, b);
        }
        else if(choice == 3){
            mn. multiply(a, b);
        }
        else if(choice == 4){
            mn. divide(a, b);
        }
        else{
            System.out.println("Invalid choice");
        }
        }
    }



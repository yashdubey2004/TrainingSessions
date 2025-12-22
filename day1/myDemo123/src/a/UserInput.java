package a;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:"); 
        int b = sc.nextInt();
        Maths cd = new Maths();
        float mul = cd. multiply(a, b);
        System.out.println("multiplication is: " + mul);
        // sc.nextLine();
        // System.out.println("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + "!");
        float avg = cd.average(mul);
        System.out.println("Average is: " + avg);
    }
}

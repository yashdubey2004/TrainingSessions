package day2.Demo2.someCodes;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter marks in Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter marks in Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter marks in Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter marks in Subject 5: ");
        float sub5 = sc.nextFloat();
        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        float average = total / 5;
        char grade = ' ';
        if(average >= 90){
            grade = 'A';
        } else if(average >= 80){
            grade = 'B';
        } else if(average >= 70){
            grade = 'C';
        } else if(average >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("---------------------------");
        
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

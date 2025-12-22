package a;

import b.AccessLearn;

public class TestAccessfirst {
    public static void main(String[] args) {
        AccessLearn a1 = new AccessLearn();
        System.out.println("City: " + a1.city); // Accessible
        System.out.println("Year: " + a1.year); // Accessible
        System.out.println("Percentage: " + a1.percentage); // Accessible
        System.out.println("Grade: " + a1.grade); // Not Accessible
    }
}

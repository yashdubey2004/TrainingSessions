package day2.Demo2.src.pack_02;

public class TheStatic {
    int age = 25; // non-static variable
    static int fees = 5000; // static variable

    void m1(){
        System.out.println("Non-Static method m1");
        // m2(); // non-static method can access static method/variable directly
        System.out.println("Fees: " + fees);
        System.out.println("Age: " + age);
    }
    static void m2(){
        System.out.println("Static method m2");
        // m1(); // static method cannot access non-static method/variable directly
        //System.out.println("Age: " + age);
        System.out.println("Fees: " + fees);
    }
    public static void main(String[] args) {
        TheStatic ts = new TheStatic();
        ts.m1();
        TheStatic.m2();
        System.out.println("Age: " + ts.age);
        System.out.println("Fees: " + TheStatic.fees);
    }
}

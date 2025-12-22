package pack_01;

public class Addition {
    // method overloading compile time polymorphism

    void addMe(int a, int b) {
        System.out.println("2 number Sum: " + (a + b));
    }
    void addMe(int a, int b, int c) {
        System.out.println("3 number Sum: " + (a + b + c));
    }
    void addMe(double a, double b) {
        System.out.println("Double Sum: " + (a + b));
    }
}

package a;

public class Maths {
    // public static void main(String[] args) {
    //     float a = 55f;
    //     float b = 45f;
    //     System.out.println("addition is: " + (a + b));
    //     Maths mn = new Maths();
    //     mn.multiply(a, b);
    //     mn. subtract(a, b);
    //     mn. divide(a, b);
    // }

    float multiply(int a, int b) {
        //System.out.println("multiplcation is: " + (a * b));
        return (a*b*1f);
    }

    void subtract(float a, float b) {
        System.out.println("subtraction is: " + (a - b));
    }

    void divide(float a, float b) {
        System.out.println("division is: " + (a / b));
    }

    float average(float a){
        return (a/2);
    }
}

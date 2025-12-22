package a;

public class Execution {
    public static void main(String[] args) {
        Maths ab = new Maths();
        float a = 10f;
        float b = 45f;
        System.out.println("addition is: " + (a + b));
        ab.multiply(a, b);
        ab.subtract(a, b);
        ab.divide(a, b);
    }
}

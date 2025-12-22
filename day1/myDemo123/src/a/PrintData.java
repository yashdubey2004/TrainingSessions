package a;

public class PrintData {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PrintData pd = new PrintData();
        pd.speak();
    }

    void speak() {
        System.out.println("Hello from speak method!");
    }
}

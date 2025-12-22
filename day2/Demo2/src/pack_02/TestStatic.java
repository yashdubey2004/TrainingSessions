package day2.Demo2.src.pack_02;

public class TestStatic {
    public static void main(String[] args) {
        // Static functions can be called without creating object

        TheStatic ss = new TheStatic();
        ss.m1();
        TheStatic.m2();
        
    }
}

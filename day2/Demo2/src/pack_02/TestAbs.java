package day2.Demo2.src.pack_02;

public class TestAbs {
    public static void main(String[] args) {
        //Abstract class cannot be instantiated

        // MyAbstract ma = new MyAbstract();
        // ma.nonAbs(); 
        useAbs ua = new useAbs();
        ua.nonAbs();
        ua.absMethod();
    }
}

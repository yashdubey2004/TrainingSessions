public class TestThread {
    public static void main(String[] args) {
        ThreadingDemo t1 = new ThreadingDemo();
        ThreadingDemo t2 = new ThreadingDemo();
        
        t1.start();
        t2.start();
    }
}

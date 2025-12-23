public class Booking {
    public static void main(String[] args) {
        Bus b = new Bus(2);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(b);
        t1.setName("Sujal");
        t2.setName("Saksham");
        t3.setName("Yash");
        t1.start();
        t2.start();
        t3.start();
    }
}

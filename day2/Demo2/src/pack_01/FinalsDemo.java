package pack_01;

public class FinalsDemo {
    int speed = 90;

    void mySpeed() {
        // speed = 100;
        System.out.println("Speed is: " + speed);
    }
}

class FullSpeed extends FinalsDemo {
    @Override
    void mySpeed() {
        speed = 120;
        System.out.println("Full speed is: " + speed);
    }
}

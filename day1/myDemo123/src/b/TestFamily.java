package b;

public class TestFamily {
    public static void main(String[] args) {
        // Father father = new Father();
        // father.read(); 
        Child child = new Child();
        child.read();
        Child1 child1 = new Child1();
        child1.read();
        Father father = new Father();
        father.yoga();
        child.yoga();
        child1.yoga();
    }
}

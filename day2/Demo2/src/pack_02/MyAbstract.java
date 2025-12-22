package day2.Demo2.src.pack_02;

//Abstraction using abstract class

public abstract class MyAbstract {
    void nonAbs(){
        System.out.println("This is a non-abstract method.");
    }

    abstract void absMethod();
}

class useAbs extends MyAbstract{
    void absMethod(){
        System.out.println("This is the implementation of abstract method.");
    }
}

package pack_01;

public class Books {
    // Constructor

    Books() {
        System.out.println("I like books");
    }

    Books(String name) {
        System.out.println("My favourite book is " + name);
    }

    Books(String name, String author){
        System.out.println("The book" + name  + "is written by " + author);
    }

    Books(String name, int price, char grade){
        System.out.println("The book " + name + " costs " + price + " and has a grade of " + grade);
    }
}

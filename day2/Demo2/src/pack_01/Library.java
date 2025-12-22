package pack_01;

public class Library {
    public static void main(String[] args) {
        Books b =  new Books();
        Books b1 = new Books("Harry Potter");
        Books b2 = new Books("Inferno", "Dan Brown");
        Books b3 = new Books("Hands on Machine Learning", 4500, 'A');
    }
}

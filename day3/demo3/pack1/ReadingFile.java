import java.io.*;
import java.util.Scanner;


public class ReadingFile {
    public static void main(String[] args) {
        try {
            File F1 = new File("D:\\lalalalalala.txt");
            Scanner sc = new Scanner(F1);
            
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            
            sc.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

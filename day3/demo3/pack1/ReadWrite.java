import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        File cc = new File("D:\\lalalalalala.txt");
        FileWriter rr = new FileWriter(cc);
        rr.write("Written Successfully");
        System.out.println("File written successfully");
        rr.close();

        FileReader fd = new FileReader(cc);
        Scanner sc = new Scanner(fd);
        while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
        }
        System.out.println("File read successfully");
        sc.close();
    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File cc = new File("D:\\nayifile.txt");
        FileWriter rr = new FileWriter(cc);
        rr.write("This is my new text");
        System.out.println("File written successfully");
        rr.close();
    }
}

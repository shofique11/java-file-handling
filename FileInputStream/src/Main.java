import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // Initialize FileInputStream with a file path
            fis = new FileInputStream("shofique.txt");

            int byteContent;

            // Read each byte from the file until the end of the file (EOF)
//            while ((byteContent = fis.read()) != -1) {
//                // byteContent  print
//                System.out.print(byteContent+" ");
//            }
            while ((byteContent = fis.read()) != -1) {
                // Cast byteContent to char and print
                System.out.print((char) byteContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the FileInputStream in the finally block to release resources
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

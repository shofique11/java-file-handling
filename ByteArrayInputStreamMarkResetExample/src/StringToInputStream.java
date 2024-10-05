import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StringToInputStream {
    String text = "Java Programming";
    byte[] byteText = text.getBytes();
    InputStream inputStream = new ByteArrayInputStream(byteText);
    int byteReadCode;
    public void getInputStream() {
        // Read and print the data from the InputStream
        while (true) {
            try {
                if ((byteReadCode = inputStream.read()) == -1) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char) byteReadCode);
        }
    }
}

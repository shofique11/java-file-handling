import java.io.ByteArrayInputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ASCII values for 'A', 'B', 'C', 'D', 'E'
        byte[] byteData = {65, 66, 67, 68, 69};

        // Create a ByteArrayInputStream from the byte array
        ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(byteData);

        int byteRead;
        // Read each byte from the ByteArrayInputStream
        while ((byteRead = byteArrayInput.read()) != -1){
            //cast the byte to the char and print it
            System.out.print((char)byteRead+" ");
        }
        try {
            byteArrayInput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
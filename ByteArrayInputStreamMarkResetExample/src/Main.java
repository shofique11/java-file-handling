import java.io.ByteArrayInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte[] byteData = {65, 66, 67, 68, 69}; // 'A', 'B', 'C', 'D', 'E'
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteData);
        // Read and print the first byte
        System.out.println((char) byteArrayInputStream.read());
        byteArrayInputStream.mark(0);
        System.out.println((char) byteArrayInputStream.read());
        System.out.println((char) byteArrayInputStream.read());
        //System.out.println((char) byteArrayInputStream.read());
       // System.out.println((char) byteArrayInputStream.read());

        //reset the mark position of back before B
        byteArrayInputStream.reset();
        System.out.println((char) byteArrayInputStream.read());
        System.out.println((char) byteArrayInputStream.read());
        StringToInputStream stringToInputStream = new StringToInputStream();
        stringToInputStream.getInputStream();
    }
}
import java.nio.ByteBuffer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10); // Buffer of size 10 bytes
        // Write data to the buffer
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }
        // Switch buffer from write mode to read mode
        buffer.flip();

        // Read data from the buffer
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
    }
}
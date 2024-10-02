import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try(FileInputStream fis = new FileInputStream("Example.txt");
            FileChannel channel = fis.getChannel()) {
            // Create a buffer with a size of 1024 bytes
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            // Read data from the channel into the buffer
            try {
                int bytesRead = channel.read(byteBuffer);
                while (bytesRead != -1){
                    // Flip the buffer to read mode
                    byteBuffer.flip();
                    while (byteBuffer.hasRemaining()){
                        System.out.print((char) byteBuffer.get());
                    }
                    // Clear the buffer for next read
                    byteBuffer.clear();
                    bytesRead = channel.read(byteBuffer);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
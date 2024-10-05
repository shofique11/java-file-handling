import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

    // Open input and output streams
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream("input_image.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    FileOutputStream fos;

    {
        try {
            fos = new FileOutputStream("output_image_copy.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    int byteContent;
    public void  copyFile()
    {
        while (true){
            try {
                if ((byteContent = fis.read()) == -1) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fos.write(byteContent);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("File copy successful!");
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

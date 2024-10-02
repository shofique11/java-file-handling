import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Example.txt");
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("Deleted the file: " + file.getName());
            }

        }else {
            System.out.println("Failed to delete the file.");
        }
    }
}
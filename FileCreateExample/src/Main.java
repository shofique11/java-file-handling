import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
            try{
            File file = new File("Example.txt");
            if(file.createNewFile())
            {
                System.out.println("File created: "+ file.getName());
            }
            }catch (IOException e)
            {
                e.printStackTrace();
            }

        try {
            FileWriter fileWriter = new FileWriter("Example.txt");
            fileWriter.write("Hi Java Programming");
            fileWriter.close();
            System.out.println("File is written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt", true))) {
            writer.write("\nAppending text to file.");
            writer.newLine();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
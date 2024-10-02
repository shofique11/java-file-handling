import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
     File file = new File("Example.txt");
     if(file.exists())
     {
         System.out.println("File is existing");
         System.out.println("File name: "+file.getName());
         System.out.println("File path: "+file.getPath());
         System.out.println("File Size: "+file.length());
         System.out.println("Is writable: "+file.canWrite());
         System.out.println("Is readable: "+file.canRead());
         System.out.println("Free space: "+file.getFreeSpace());

     }else{
         System.out.println("File no exist");
     }
     File file1 = new File("shofique.txt");
        try {
            if(file1.createNewFile()){
                System.out.println("File created successfully");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Files.copy(Paths.get("Example.txt"), Paths.get("destination.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
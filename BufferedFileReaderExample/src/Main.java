import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("example.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader irs = new InputStreamReader(fis);
        BufferedReader reader = new BufferedReader(irs);
        String line;
        // Read each line from the file
        while (true)
        {
            try {
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
        }
        FileCopyExample fileCopyExample = new FileCopyExample();
        fileCopyExample.copyFile();
    }
}
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Specify the audio format
        AudioFormat format = new AudioFormat(16000, 8, 2, true, true);
        // Get the target data line from the system
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        try {
            TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(info);
            microphone.open();
            microphone.start();
            AudioInputStream audioSteam = new AudioInputStream(microphone);
            System.out.println("Recording started...");
            // Write the captured audio to a file
            File outputFile = new File("shofique_audion.wav");
            AudioSystem.write(audioSteam, AudioFileFormat.Type.WAVE, outputFile);
            System.out.println("Recording save to "+outputFile.getAbsolutePath());
        } catch (LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
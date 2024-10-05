import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // Load the audio file (in this case, a .wav file)
            File audioFile = new File("videoplayback.mp4");

            //Get the audio input stream from file
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            //get a sound format from audio input
            AudioFormat format = audioStream.getFormat();
            // get the data line from the format
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Create a clip to play the audio
            try {
                Clip audioClip = (Clip) AudioSystem.getLine(info);
                // Open the audio clip with the audio stream
                audioClip.open(audioStream);
                // Start playing the audio
                audioClip.start();

                // Keep the program running while the audio is playing
                System.out.println("Playing audio...");
                try {
                    Thread.sleep(audioClip.getMicrosecondLength() / 1000); // Sleep for the duration of the audio
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } catch (LineUnavailableException e) {
                throw new RuntimeException(e);
            }
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
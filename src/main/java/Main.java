import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File file = new File("Polish cow (English Lyrics Full Version) (128 kbps).wav");
        AudioInputStream stream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(stream);
        float x1 = Float.parseFloat(JOptionPane.showInputDialog("What is x1"));
        float x2 = Float.parseFloat(JOptionPane.showInputDialog("What is x2"));
        float y1 = Float.parseFloat(JOptionPane.showInputDialog("What is y1"));
        float y2 = Float.parseFloat(JOptionPane.showInputDialog("What is y2"));
        float formula = (float) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        float midpointx = (x1 + x2) / 2;
        float midpointy = (y1 + y2) / 2;

        clip.start();
        
        JOptionPane.showMessageDialog(null,"The answer is " + formula);
        JOptionPane.showMessageDialog(null,"The midpoint is " + "(" + midpointx + ", " + midpointy + ")");
        
    }
}

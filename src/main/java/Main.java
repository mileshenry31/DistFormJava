import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float x1 = Float.parseFloat(JOptionPane.showInputDialog("What is x1"));
        float x2 = Float.parseFloat(JOptionPane.showInputDialog("What is x2"));
        float y1 = Float.parseFloat(JOptionPane.showInputDialog("What is y1"));
        float y2 = Float.parseFloat(JOptionPane.showInputDialog("What is y2"));
        float formula = (float) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        float midpointx = (x1 + x2) / 2;
        float midpointy = (y1 + y2) / 2;
        JOptionPane.showMessageDialog(null,"The answer is " + formula);
        JOptionPane.showMessageDialog(null,"The midpoint is " + "(" + midpointx + ", " + midpointy + ")");
    }
}

import java.awt.*;
import javax.swing.*;

public class Calculator {
    JFrame frame;

    Calculator(){
        frame = new JFrame("Swing Calculator");
        frame.setSize(420, 550);
        frame.getContentPane().setBackground(new Color(44, 51, 51));
        frame.setLayout(null);

        frame.setVisible(true);
    }
}

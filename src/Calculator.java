import java.awt.*;
import javax.swing.*;

public class Calculator {
    JFrame frame;
    JPanel panel;

    Calculator(){
        frame = new JFrame("Swing Calculator");
        frame.setSize(420, 550);
        frame.getContentPane().setBackground(new Color(44, 51, 51));
        frame.setLayout(null);

        panel = new JPanel();
        panel.setBounds(50, 100, 310, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(44, 51, 51));

        frame.add(panel);
        frame.setVisible(true);
    }
}

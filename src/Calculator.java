import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JPanel panel;
    JTextField textField;
    Font calFont = new Font("calibri", Font.BOLD, 25);
    JButton[] numbtn = new JButton[10];
    JButton[] fubtn = new JButton[9];

    Calculator(){
        frame = new JFrame("Swing Calculator");
        frame.setSize(420, 550);
        frame.getContentPane().setBackground(new Color(44, 51, 51));
        frame.setLayout(null);

        panel = new JPanel();
        panel.setBounds(50, 100, 310, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(44, 51, 51));

        textField = new JTextField();
        textField.setBounds(50, 25, 310, 50);
        textField.setEditable(false);
        textField.setFont(calFont);
        textField.setBackground(new Color(203, 228, 222));

        for(int i=0 ; i<10 ; i++){
            numbtn[i] = new JButton(String.valueOf(i));
            numbtn[i].setFont(calFont);
            numbtn[i].setFocusable(false);
            numbtn[i].setBackground(new Color(14, 131, 136));
            numbtn[i].addActionListener(this);
        }

        fubtn[2] = new JButton("/");    //divbtn
        fubtn[1] = new JButton("X");    //mulbtn
        fubtn[0] = new JButton("-");    //subbtn
        fubtn[3] = new JButton("+");    //addbtn
        fubtn[4] = new JButton(".");    //dotbtn
        fubtn[5] = new JButton("=");    //equbtn
        fubtn[6] = new JButton("(-)");    //minbtn
        fubtn[7] = new JButton("DEL");    //delbtn
        fubtn[8] = new JButton("AC");    //clrbtn

        for(int i=0 ; i<9 ; i++){
            fubtn[i].setFont(calFont);
            fubtn[i].setFocusable(false);
            fubtn[i].setBackground(new Color(14, 131, 136));
        }

        fubtn[6].setBounds(50, 430, 100, 50);
        fubtn[7].setBounds(150, 430, 100, 50);
        fubtn[8].setBounds(250, 430, 100, 50);

        for(int i=6 ; i>=0 ; i--){
            panel.add(numbtn[i+1]);
            panel.add(numbtn[i+2]);
            panel.add(numbtn[i+3]);
            panel.add(fubtn[i/3]);
            i-=2;
        }
        panel.add(fubtn[4]);
        panel.add(numbtn[0]);
        panel.add(fubtn[5]);
        panel.add(fubtn[3]);

        frame.add(panel);
        frame.add(fubtn[6]);
        frame.add(fubtn[7]);
        frame.add(fubtn[8]);
        frame.add(textField);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0 ; i<10 ; i++){
            if(e.getSource() == numbtn[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
    }
}

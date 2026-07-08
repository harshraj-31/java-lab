import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   // IMPORTANT

public class DATA_INSERT {
    public static void main(String args[]) 
	{
        JFrame frame = new JFrame("HOME");

        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        // TEXT FIELD
        JTextField txt = new JTextField(15);

        // BUTTON
        JButton btn = new JButton("TOUCH ME");

        // ACTION
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                txt.setText("TE TOUCH KAYRU");
            }
        });

        frame.add(txt);
        frame.add(btn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


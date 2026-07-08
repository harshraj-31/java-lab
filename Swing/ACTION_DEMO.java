import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ACTION_DEMO
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("ACTION_DEMO");
        f.setSize(500,500);
        f.setLayout(new FlowLayout());

        JTextField txt = new JTextField(15);
        JButton bj = new JButton("MANE ADO");
        JLabel lb = new JLabel("AYA AAVSE");

        f.add(txt);
        f.add(bj);
        f.add(lb);
		
        bj.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {  
                lb.setText(txt.getText());   
            }
        });

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



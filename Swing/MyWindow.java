import java.awt.event.*;
import javax.swing.*;

class MyWindow
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Person Form");

        //Name label and text
        JLabel l1 = new JLabel("Name");
        //.setBounds(X,Y,Width,Height)
        l1.setBounds(50,50,60,20);
        f.add(l1);


        JTextField t1 = new JTextField();
        t1.setBounds(120,50,100,20);
        f.add(t1);


        //Age 
        JLabel l2 = new JLabel("Age");
        //.setBounds(X,Y,Width,Height)
        l2.setBounds(50,80,60,20);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(120,80,100,20);
        f.add(t2);


         //Label for action Listener:
        JLabel buttonDisplay = new JLabel();
        buttonDisplay.setBounds(85,150,300,30);
        f.add(buttonDisplay);


        //Submit Button
        JButton button = new JButton("Submit");
        button.setBounds(85,120,80,30);


        //Button Action Listener
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                String nm = t1.getText();
                String ag =t2.getText();

                buttonDisplay.setText("NAME: "+nm+" AGE IS "+ag);
            }
        });


        f.add(button);

    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);


    }
}
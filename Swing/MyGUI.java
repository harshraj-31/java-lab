import java.awt.event.*;  // Import Swing package for GUI components
import javax.swing.*;  // for ActionListener

class MyGUI
{
    public static void main(String[] args)
    {
        // Create a JFrame (window) with title "GUI"
        JFrame frame = new JFrame("MyGUI");

        frame.setSize(400, 300); // Set the size

        // EXIT_ON_CLOSE → program will terminate
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Allows manual placement of components using setBounds()
        frame.setLayout(null);


        // Add components here (like buttons, labels, textfields)
        

        //LABELS
        JLabel nm = new JLabel("Name: ");//Name label
        //.setBounds(X,Y,Width,Height)
        nm.setBounds(50,50,100,30);
        frame.add(nm);

        JLabel showname = new JLabel(); //label for actionListener
        showname.setBounds(150,150,300,40);
        frame.add(showname);


        //TextField
        JTextField nminp = new JTextField();
        nminp.setBounds(150,50,150,30);
        frame.add(nminp);


        //Button
        JButton subbtn = new JButton("Submit");
        subbtn.setBounds(150,100,100,30);

        //Button Click action
        subbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name = nminp.getText(); //→ read input
                showname.setText("HEllo "+name+" !");//setText() → display output
            }
        });

        frame.add(subbtn);


        // show window (write it in last)
        frame.setVisible(true);
    }
}
import java.awt.event.*;
import javax.swing.*;

class MenuBasicDemo
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("MenuBarDemo");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        //MENU BAR
        JMenuBar menuBar = new JMenuBar();

        //MENU's
        JMenu file = new JMenu("File");

        //Menu Item for File Menu
        JMenuItem helloItem = new JMenuItem("Hello");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem exitItem = new JMenuItem("Exit");


        //LABEL, TEXTBOX & BUTTON for NAME
        JLabel nm = new JLabel("Name: ");

        // setBounds(x,y,width,height)
        nm.setBounds(50,50,70,30);
        frame.add(nm);

        JTextField nmtxt = new JTextField();
        nmtxt.setBounds(100,50,100,30);
        frame.add(nmtxt);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(75,150,120,30);
        frame.add(submit);



        //Adding menuItems in file menu
        file.add(helloItem);
        file.add(aboutItem);
        file.addSeparator();
        file.add(exitItem);

        //Add menu to menu bar
        menuBar.add(file);
        frame.add(menuBar);

    


        //Actions

        //ACTION FOR HELLOITEM
        helloItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame,"Hello Student");
            }
        });

        //ACTION FOR ABOUTIEM
        aboutItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame,"Created by James Bond");
    
            }
        });

        //ACTION FOR EXITITEM
        exitItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        
        //Action for submit
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame,"Hello "+nmtxt.getText());
            }
        });


        frame.setVisible(true);
        frame.setJMenuBar(menuBar);
    }
}
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Login
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Login");
        // Removes the "automatic organizer" so you can place buttons exactly where you want using coordinates (x, y).
        frame.setLayout(null); 

        // Sets the window size to 500 pixels wide and 500 pixels high.
        frame.setSize(500, 500); 

        // Tells the program to fully stop running when you click the 'X' button on the window.
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 


        //Label and textbox
        JLabel nm = new JLabel("Name: ");
        nm.setBounds(50,70,80,20);
        frame.add(nm);


        JTextField nmtxt = new JTextField();
        nmtxt.setBounds(140,70,120,20);
        frame.add(nmtxt);


        JLabel pass = new JLabel("Password: ");
        pass.setBounds(50,100,80,20);
        frame.add(pass);


        JPasswordField  passtxt = new JPasswordField();
        passtxt.setBounds(140,100,120,20);
        frame.add(passtxt);

        //Label to display user
        JLabel shownm = new JLabel("");
        shownm.setBounds(95,200,250,30);
        frame.add(shownm);


        //BUTTONS
        JButton okbtn = new JButton("OK");
        okbtn.setBounds(85,150,80,20);
        frame.add(okbtn);

        JButton cnclbtn = new JButton("CANCEL");
        cnclbtn.setBounds(180,150,100,20);
        frame.add(cnclbtn);


        okbtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String name = nmtxt.getText();
                String pswd = passtxt.getText().toString();

                System.out.println("Name: "+name+" Password: "+pass);

                try
                {
                    if(name.equals("Arnold") && pswd.equals("Back2Biceps"))
                    {
                        shownm.setText("Login Successfull "+name);
                        FileWriter writer = new FileWriter("login.txt");
                        writer.write(name+" "+pswd);
                        writer.close();
                    }
                    else
                    {
                        shownm.setText("invalid name or password, try again!");
                    }

                }catch(IOException er)
                {
                    System.out.println("Error: "+er.getMessage());
                }

            }
        });

        // Makes the window actually appear on your screen (windows are hidden by default)., keep this line at last
        frame.setVisible(true);
    }
}
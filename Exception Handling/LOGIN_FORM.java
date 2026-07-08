import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class LOGIN_FORM
{
	public static void main(String args[])
	{
		JFrame frame = new JFrame("LOGIN FORM");
		frame.setSize(400, 400);
		frame.setLayout(null);

		JLabel label1 = new JLabel("ENTER THE NAME");
		label1.setBounds(20,20,200,30);

		JLabel label2 = new JLabel("ENTER THE PASSWORD");
		label2.setBounds(20,70,200,30);

		JLabel label3 = new JLabel();
		label3.setBounds(120,150,200,30);

		JTextField text1 = new JTextField();
		text1.setBounds(220,20,120,30);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(220,70,120,30);

		JButton btn = new JButton("LOGIN");
		btn.setBounds(120,130,100,30);

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(text1);
		frame.add(pass);
		frame.add(btn);

		btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {  
               String uname = text1.getText();
			   String upass = new String(pass.getPassword());

			   try
			   {  
				   FileWriter fw = new FileWriter("login.txt", true);

				   if(uname.equals("123") && upass.equals("123"))
				   {
					   label3.setText("LOGIN SUCCESS");
					   fw.write(uname + " " + upass + "\n");
					   fw.close();				   
				   }
				   else
				   {
					   label3.setText("WRONG USERNAME/PASSWORD");
				   }
			   }
			   catch(Exception ex)
			   {
				   label3.setText("ERROR");
			   }
            }
        });
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
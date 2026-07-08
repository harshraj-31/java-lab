import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class PRACTISH
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("HOME");
        jf.setSize(500,500);
        jf.setLayout(null);

        JLabel lb1 = new JLabel("ENTER YOUR ID");
        lb1.setBounds(20,20,220,50);

        JLabel lb2 = new JLabel("ENTER YOUR PASS");
        lb2.setBounds(20,60,220,50);

        JLabel lb3 = new JLabel();
        lb3.setBounds(150,180,150,50);

		JCheckBox ch1 = new JCheckBox("JAVA");
		ch1.setBounds(50,190,104,50);
		
		JLabel lb4 = new JLabel(" NOT SELECTED ");
		lb4.setBounds(50, 220, 100, 30);
		

        JTextField t1 = new JTextField();
        t1.setBounds(150,28,110,30);

        JTextField t2 = new JTextField();
        t2.setBounds(150,70,110,30);

        JButton b1 = new JButton("LOGIN");
        b1.setBounds(150,120,110,30);

        jf.add(lb1);
        jf.add(lb2);
        jf.add(lb3);
        jf.add(lb4);
        jf.add(t1);
        jf.add(t2);
        jf.add(b1);
        jf.add(ch1);
		

        // FUNCATION 1
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String uname = t1.getText();
                String upass = t2.getText();

                try
                {
					FileWriter fw = new FileWriter("C:/Users/jaysu/Desktop/MCA SEM 2/PATHON 2025/UNIT 5/login.txt");
                    if(uname.equals("123") && upass.equals("123"))
                    {
                        lb3.setText("Login Done");
                        fw.write(uname + " " + upass);
                        fw.close();
                    }
                    else
                    {
                        lb3.setText("INVALID");
                    }
                }
                catch(Exception ex)
                {
                    lb3.setText("ERROR");
                }
            }
        });
		// FUNCATION 2
		ch1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				if(ch1.isSelected())
				{
					lb4.setText("SELECTD");
				}
				else
				{
					lb4.setText(" not SELECTD");
				}
				
			}
		});
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
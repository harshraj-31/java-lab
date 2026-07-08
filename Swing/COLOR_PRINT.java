import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class COLOR_PRINT
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("COLOR_PRINT");
		f.setSize(500,500);
			
		JLabel label1 = new JLabel("ENTER THE COLOR");
		label1.setBounds(20,20,200,30);
		
		JLabel label2 = new JLabel("COLOR AYA AAVSE");
		label2.setBounds(100,110,200,30);

		JTextField txt = new JTextField();
		txt.setBounds(150,20,200,30);

		JButton button = new JButton("SUBMIT");
        button.setBounds(50,70,200,30);
		
		
		// CONDITIONS
		
		button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {  
				String color = txt.getText();				
				if(color.equals("RED"))
				{
					label2.setText(color);
					label2.setForeground(Color.RED);
				}
				else if(color.equals("YELLOW"))
				{
					label2.setText(color);
					label2.setForeground(Color.YELLOW);
				}
				else if(color.equals("PINK"))
				{
					label2.setText(color);
					label2.setForeground(Color.PINK);
				}
				else if(color.equals("WHITE"))
				{
					label2.setText(color);
					label2.setForeground(Color.WHITE);
				}
				else if(color.equals("GREEN"))
				{
					label2.setText(color);
					label2.setForeground(Color.GREEN);
				}				
			}
		});
		f.add(label1);
		f.add(button);
		f.add(label2);
		f.add(txt);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
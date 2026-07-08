import javax.swing.*;
// import java.awt.*;
	
public class CALCULATOR
{
	
	public static void main(String args[])
	{


		//1. CREATE FRAME
		JFrame frame = new JFrame("HOME");
		
		//1. FRAME SIZE 
		frame.setSize(500,500);
        frame.setLayout(null);		
		
		//2. LABLE
		JLabel lable1 = new JLabel("ENTER THE NUMBER 1");
		lable1.setBounds(20,20,200,100);
		
		JLabel lable2 = new JLabel("ENTER THE NUMBER 2");
		lable2.setBounds(20,60,200,100);
		
			
		//2. SHOW  LABLE
		frame.add(lable1);
		frame.add(lable2);
		
		
		//3. TEXT 
		JTextArea text1 = new JTextArea();
		text1.setBounds(200,60,180,30);
		
		JTextArea text2 = new JTextArea();
		text2.setBounds(200,100,180,30);
		
		
		//3. SHOW  TEXT
		frame.add(text1);
		frame.add(text2);
		
		//4. button
		JButton button1 = new JButton(" sum ");
		button1.setBounds(210,150,70,40);
		
		JButton button2 = new JButton(" DIV ");
		button2.setBounds(300,150,70,40);
		
		JButton button3 = new JButton(" MUL ");
		button3.setBounds(210,200,70,40);
		
		JButton button4 = new JButton(" SUB ");
		button4.setBounds(300,200,70,40);
		//4. show button
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		
		// CLOSE OPRATION
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// SHOW FRAME 
		frame.setVisible(true);
		
		
	}
}
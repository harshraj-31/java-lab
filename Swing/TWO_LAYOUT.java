import javax.swing.*;
import java.awt.*;
public class  TWO_LAYOUT
{
	public static void main(String ags[])
	{
		JFrame frame = new JFrame("HOME");
		
		frame.setSize(500,500);
		frame.setLayout(null);
	
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		
		

		// frame.setLayout(new GridLayout(3,4));
		// frame.add(new JButton("1"));
		// frame.add(new JButton("2"));
		// frame.add(new JButton("3"));
		// frame.add(new JButton("4"));
		
		frame.SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.SetVisible(true);
        
		
		
		
	}
}
import javax.swing.*;

public class SIMPLE_SWING
{
    public static void main(String args[])
    {
        //. CREATE THE MAIN WINDOW (FRAME)
        JFrame frame = new JFrame("SIMPLE SWING ARGS");
        
        //. SET THE WINDOW SIZE (WIDTH, HEIGHT)
        frame.setSize(500, 500);
        
        //. CLOSE THE APPLICATION WHEN WINDOW IS CLOSED
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //. REMOVE DEFAULT LAYOUT (for manual positioning)
        frame.setLayout(null);
        
        //. CREATE A BUTTON
        JButton button = new JButton("TOUCH ME");
		
		//. position (x,y,width,height)
        button.setBounds(200, 250, 120, 40); 
        
        //. ADD BUTTON TO FRAME
        frame.add(button);
        
        //. MAKE THE WINDOW VISIBLE
        frame.setVisible(true);
    }
}
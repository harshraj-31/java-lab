import java.awt.event.*;
import javax.swing.*;

public class CheckboxExample {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Sensor Test");

        JCheckBox box = new JCheckBox("Include Sugar");
        box.setBounds(190,100,300,40);

        JLabel lbl = new JLabel();
        lbl.setBounds(80,100,300,30);
        frame.add(lbl);


        // box.addItemListener(new ItemListener()
        // {
        //     public void itemStateChanged(ItemEvent e)
        //     {
        //         if(e.getStateChange() == ItemEvent.SELECTED)
        //         {
        //             lbl.setText("Box ticked");
        //         }
        //         else
        //         {
        //             lbl.setText("");
        //         }
        //     }
        // });

        // Adding the ItemListener to the checkbox
        box.addItemListener(new ItemListener() 
        {
            public void itemStateChanged(ItemEvent e) 
            {
                // Check if the box was checked or unchecked
                if (e.getStateChange() == ItemEvent.SELECTED) 
                {
                    lbl.setText("Sugar added!");
                }
                else 
                {
                    lbl.setText("Sugar removed!");
                }
            }
        });

        
        frame.add(box);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
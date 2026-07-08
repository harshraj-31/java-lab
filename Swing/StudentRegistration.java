//                      DIV A SET 1 question - 2
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudentRegistration
{
    public static void main(String[] args) 
    {
        // Create main frame
        JFrame frame  = new JFrame("Student Registration");

        // Set layout: 6 rows and 2 columns (form structure)
        frame.setLayout(new GridLayout(6,2));

        // Set size of frame
        frame.setSize(500,500);

        // Close application on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------------- ROLL NUMBER --------------------

        // Label and TextField for Roll Number
        JLabel roll = new JLabel("Roll Number ");
        JTextField rolltxt = new JTextField();

        // Add to frame (Row 1)
        frame.add(roll);
        frame.add(rolltxt);

        // -------------------- NAME --------------------

        // Label and TextField for Name
        JLabel name = new JLabel("Name ");
        JTextField nametxt = new JTextField();

        // Add to frame (Row 2)
        frame.add(name);
        frame.add(nametxt);

        // -------------------- GENDER --------------------

        // Label for Gender
        JLabel gender = new JLabel("Gender");

        // Create Radio Buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        
        // ButtonGroup ensures only one option can be selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // JPanel groups multiple components into one unit
        // Required because GridLayout allows only one component per cell
        JPanel p = new JPanel();
        p.add(male);
        p.add(female);

        // Add to frame (Row 3)
        frame.add(gender);
        frame.add(p);

        // -------------------- DIVISION --------------------

        // Array of division options
        String div[] = {"A","B","C","D","E"};

        // Label and ComboBox for Division
        JLabel dvsn = new JLabel("Division");
        JComboBox division = new JComboBox(div);

        // Add to frame (Row 4)
        frame.add(dvsn);
        frame.add(division);

        // -------------------- OUTPUT AREA --------------------

        // Label and TextArea to display entered details
        JLabel op = new JLabel("OutPut :");
        JTextArea area = new JTextArea();

        // -------------------- BUTTONS --------------------

        // Create Register and Clear buttons
        JButton register = new JButton("REGISTER");
        JButton clear = new JButton("CLEAR ");
        
        // ActionListener for Register button
        register.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // Get input from text fields
                String rno = rolltxt.getText();
                String nm = nametxt.getText();

                // Determine selected gender
                String gen;
                if(male.isSelected())
                {
                    gen = "Male";
                }
                else if(female.isSelected())
                {
                    gen = "Female";
                }
                else
                {
                    gen = "Not Selected";
                }

                // Get selected division from ComboBox
                String div = (String)division.getSelectedItem();

                // Display all details in JTextArea
                area.setText(
                    "Roll No: "+rno+"\n"+
                    "Name: "+nm+"\n"+
                    "Gender: "+gen+"\n"+
                    "Division: "+div
                );
            }
        });

        // ActionListener for Clear button
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                // Clear text fields
                rolltxt.setText("");
                nametxt.setText("");

                // Clear radio button selection
                bg.clearSelection();

                // Reset ComboBox to first item
                division.setSelectedIndex(0);

                // Clear output area
                area.setText("");
            }
        });

        // JPanel to group buttons together
        JPanel bp = new JPanel();
        bp.add(register);
        bp.add(clear);

        // Add buttons to frame (Row 5)
        frame.add(new JLabel("Actions"));
        frame.add(bp);

        // Add output area to frame (Row 6)
        frame.add(op);
        frame.add(area);

        // Make frame visible
        frame.setVisible(true);
    }
}
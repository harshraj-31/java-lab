import javax.swing.*;
import java.awt.*;

public class STUDENT_FORM_LAYOUT {
    public static void main(String args[]) {

        JFrame frame = new JFrame("STUDENT FORM");
        frame.setSize(500, 500);

        // FLOW LAYOUT
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // LABEL + TEXTFIELD
        frame.add(new JLabel("ENTER THE NAME"));
        frame.add(new JTextField(15));

        frame.add(new JLabel("ENTER THE EMAIL"));
        frame.add(new JTextField(15));

        frame.add(new JLabel("ENTER THE COURSE"));
        frame.add(new JTextField(15));

        frame.add(new JLabel("ENTER MOBILE NUMBER"));
        frame.add(new JTextField(15));

        // CHECKBOX
        frame.add(new JLabel("HOBBIES"));
        frame.add(new JCheckBox("FOOTBALL"));
        frame.add(new JCheckBox("HOCKEY"));

        // RADIO BUTTON (NO GROUP)
        frame.add(new JLabel("GENDER"));

        JRadioButton rb1 = new JRadioButton("MALE");
        JRadioButton rb2 = new JRadioButton("FEMALE");

        //  ButtonGroup remove kari didhu
        frame.add(rb1);
        frame.add(rb2);

        // BUTTONS
        frame.add(new JButton("SUBMIT"));
        frame.add(new JButton("RESET"));

        // CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
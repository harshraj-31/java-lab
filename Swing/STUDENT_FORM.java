import javax.swing.*;

public class STUDENT_FORM {
    public static void main(String args[]) {

        JFrame frame = new JFrame("STUDENT FORM");
        frame.setSize(500, 500);
        frame.setLayout(null);

        // LABELS
        JLabel label1 = new JLabel("ENTER THE NAME");
        label1.setBounds(20, 20, 150, 30);

        JLabel label2 = new JLabel("ENTER THE EMAIL");
        label2.setBounds(20, 60, 150, 30);

        JLabel label3 = new JLabel("ENTER THE COURSE");
        label3.setBounds(20, 100, 150, 30);

        JLabel label4 = new JLabel("ENTER MOBILE NUMBER");
        label4.setBounds(20, 140, 180, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);

        // TEXTFIELDS
        JTextField text1 = new JTextField();
        text1.setBounds(200, 20, 180, 30);

        JTextField text2 = new JTextField();
        text2.setBounds(200, 60, 180, 30);

        JTextField text3 = new JTextField();
        text3.setBounds(200, 100, 180, 30);

        JTextField text4 = new JTextField();
        text4.setBounds(200, 140, 180, 30);

        frame.add(text1);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);

        // CHECKBOX
        JCheckBox ch1 = new JCheckBox("FOOTBALL");
        ch1.setBounds(200, 180, 120, 30);

        JCheckBox ch2 = new JCheckBox("HOCKEY");
        ch2.setBounds(200, 210, 120, 30);

        frame.add(ch1);
        frame.add(ch2);

        // RADIO BUTTONS
        JRadioButton rb1 = new JRadioButton("MALE");
        rb1.setBounds(200, 250, 100, 30);

        JRadioButton rb2 = new JRadioButton("FEMALE");
        rb2.setBounds(300, 250, 100, 30);

        // GROUPING RADIO BUTTONS
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);

        // BUTTONS
        JButton b1 = new JButton("SUBMIT");
        b1.setBounds(100, 300, 120, 30);

        JButton b2 = new JButton("RESET");
        b2.setBounds(250, 300, 120, 30);

        frame.add(b1);
        frame.add(b2);

        // CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
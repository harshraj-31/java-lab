import javax.swing.*;
// import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args)
    {

        JFrame frame = new JFrame("TextArea Example");
        frame.setSize(300, 300);
        frame.setLayout(null);


        JTextArea area = new JTextArea();

        area.setEditable(false); // make read-Only
        
        area.setBounds(50,80,200,100);
       
        area.setText("Hello\nThis is multiple lines\nin JTextArea");

        frame.add(area);

        frame.setVisible(true);
    }
}
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TempConverter {

    public static void main(String[] args) {

        JFrame f = new JFrame("Temperature Converter");

        // Main panel (center everything)
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        // Row 1: Title
        JPanel p0 = new JPanel(new FlowLayout());
        p0.add(new JLabel("Enter Temperature"));

        // Row 2: Input
        JPanel p1 = new JPanel(new FlowLayout());
        JTextField t = new JTextField(15);
        p1.add(t);

        // Row 3: ComboBox
        JPanel p2 = new JPanel(new FlowLayout());
        String options[] = {
            "Celsius to Fahrenheit",
            "Celsius to Kelvin",
            "Fahrenheit to Celsius",
            "Fahrenheit to Kelvin"
        };
        JComboBox cb = new JComboBox(options);
        p2.add(cb);

        // Row 4: Buttons
        JPanel p3 = new JPanel(new FlowLayout());
        JButton convert = new JButton("Convert");
        JButton clear = new JButton("Clear");
        p3.add(convert);
        p3.add(clear);

        // Row 5: Result
        JPanel p4 = new JPanel(new FlowLayout());
        JLabel result = new JLabel("Result will appear here");
        p4.add(result);

        // Add all panels to main panel
        main.add(p0);
        main.add(p1);
        main.add(p2);
        main.add(p3);
        main.add(p4);

        // Add main panel to frame
        f.add(main);

        // Convert logic
        convert.addActionListener(e -> {
            double temp = Double.parseDouble(t.getText());
            double res = 0;
            String unit = "";

            int c = cb.getSelectedIndex();

            if (c == 0) 
            { 
                res = (temp * 9/5) + 32; unit = "°F"; 
            }
            if (c == 1) 
            { 
                res = temp + 273.15; unit = "K"; 
            }
            if (c == 2) 
            { 
                res = (temp - 32) * 5/9; unit = "°C"; 
            }
            if (c == 3) 
            { 
                res = (temp - 32) * 5/9 + 273.15; unit = "K"; 
            }

            result.setText("Result: " + String.format("%.2f", res) + " " + unit);
        });

        // Clear logic
        clear.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                t.setText("");
                result.setText("Result will appear here");
            }
        });

        // Frame settings
        f.setSize(350, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
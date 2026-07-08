import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudGrade {

    static int i = 0;
    static int total = 0;
    static int count = 0;

    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("STUDENT GRADE MANAGER");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel namelbl = new JLabel("Student Name: ");
        JTextField nametxt = new JTextField();

        JLabel markslbl = new JLabel("Student Marks: ");
        JTextField markstxt = new JTextField();

        JButton add = new JButton("Add Student");
        JButton clear = new JButton("Clear");

        JPanel panel1 = new JPanel(new GridLayout(3, 2));
        panel1.add(namelbl);
        panel1.add(nametxt);
        panel1.add(markslbl);
        panel1.add(markstxt);
        panel1.add(add);
        panel1.add(clear);
            
            
        JLabel showstudents = new JLabel();
        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);

        add.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String nm = nametxt.getText();

                if (nm.equals("")) {
                    showstudents.setText("Enter name!");
                    return;
                }
                try {
                    String markstr = markstxt.getText();
                    int mark = Integer.parseInt(markstr);

                    String grade = "";

                    if (mark < 0 || mark > 100) {
                        showstudents.setText("Marks must be 0–100");
                        return;
                    }

                    if (mark >= 90 && mark <= 100) {
                        grade = "A+";
                    } else if (mark >= 80 && mark <= 89) {
                        grade = "A";
                    } else if (mark >= 70 && mark <= 79) {
                        grade = "B";
                    } else if (mark >= 60 && mark <= 69) {
                        grade = "C";
                    } else if (mark < 60) {
                        grade = "F";
                    }

                    area.append((++i) + ". " + nm + " - " + mark + " - " + grade + "\n");

                    //AVERAGE LOGIC
                    total += mark;
                    count++;
                    double avg = (double) total / count;
                    showstudents.setText("Average: " + avg);

                } catch (Exception ex) {
                    showstudents.setText("Enter valid marks!");
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent er) {
                nametxt.setText("");
                markstxt.setText("");
                area.setText("");
                showstudents.setText("");
                i = 0;
                total = 0;
                count = 0;
            }
        });

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(showstudents, BorderLayout.SOUTH);
        frame.add(scroll, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
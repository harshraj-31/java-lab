import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Border1
{

    static int i = 1;
    public static void main(String[] args) 
    {
            JFrame frame = new JFrame("Border Example");
            frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setSize(500,500);


            //Labels and components
            JLabel name = new JLabel("Name");
            JTextField nametxt = new JTextField(20);

            JLabel age = new JLabel("Age");
            JSpinner agetxt = new JSpinner();
            agetxt.setPreferredSize(new Dimension(80,25)); // to set the JPINNER SIZE/ txtbox size
            
            JPanel panel = new JPanel();
            panel.add(name);
            panel.add(nametxt);
            panel.add(age);
            panel.add(agetxt);
            

            //TEXT AREA IN A SCROLL PANE
            JTextArea area = new JTextArea();
            JScrollPane scroll = new JScrollPane(area);
            scroll.setPreferredSize(new Dimension(300,200));

            JPanel centerPanel = new JPanel();
            centerPanel.setPreferredSize(new Dimension(300,200)); // control size
            centerPanel.add(scroll);

            JButton sub = new JButton("SUBMIT");
          
            sub.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    String nm = nametxt.getText();   // ✅ from JTextField
                    String ag = agetxt.getValue().toString(); // ✅ from JSpinner

                    area.append(i+". "+nm+" "+ag+"\n");
                    i++;
                }
            });


            frame.add(panel, BorderLayout.NORTH);
            frame.add(centerPanel, BorderLayout.CENTER);
            frame.add(sub,BorderLayout.SOUTH);


            frame.setVisible(true);
    }
}
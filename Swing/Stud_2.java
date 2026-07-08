import java.awt.event.*;
import javax.swing.*;

class Stud
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Student Form");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        //Name
        JLabel name = new JLabel("Name");
        JTextField nametxt = new JTextField();
        name.setBounds(80,100,80,30);
        nametxt.setBounds(150,100,120,30);
        frame.add(name);
        frame.add(nametxt);

        //Gender
        JLabel gen = new JLabel("Gender:");
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("FeMale");
        gen.setBounds(80,130,100,30);
        male.setBounds(150,130,100,30);
        female.setBounds(210,130,100,30);
        frame.add(gen);
        frame.add(male);
        frame.add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        

        //Hobbies
        JLabel hob = new JLabel("Hobbies:");
        JCheckBox c1 = new JCheckBox("GYM");
        JCheckBox c2 = new JCheckBox("MUSIC");
        JCheckBox c3 = new JCheckBox("MEDITATION");
        hob.setBounds(80,160,100,30);
        c1.setBounds(150,160,80,30);
        c2.setBounds(200,160,80,30);
        c3.setBounds(250,160,80,30);

        frame.add(hob);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

        //button
        JButton btn = new JButton("Submit");
        btn.setBounds(130, 340, 100, 30);

        //btn Action
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String nm = name.getText();

                //gender
                String gender = "";

                if(male.isSelected())
                {
                    gender = "Male";
                }
                else if (female.isSelected())
                {
                    gender = "Female";
                }
                
                //Hobbies
                String hobbies = "";

                if(c1.isSelected())
                {
                    hobbies+="Gym";
                }
                if(c2.isSelected())
                {
                    hobbies+="Music";
                }
                if(c3.isSelected())
                {
                    hobbies+="MEDITATION";
                }

                //OUTPUT
                String result = "Name: "+nm+
                "\nGender"+gender+
                "\nHobbies"+hobbies;

                JOptionPane.showMessageDialog(frame,result);
            }
        });

        //Adding components
        frame.add(btn);

        frame.setVisible(true);
        // frame.SetJmenuBar(menubar)
    }
}
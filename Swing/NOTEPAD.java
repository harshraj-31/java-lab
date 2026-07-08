import javax.swing.*;
import java.awt.event.*;

public class NOTEPAD
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("NOTEPAD");
        jf.setSize(700, 700);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // MENUBAR
        JMenuBar mb = new JMenuBar();

        // MENUS
        JMenu jm1 = new JMenu("FILE");
        JMenu jm2 = new JMenu("EDIT");
        JMenu jm3 = new JMenu("VIEW");

        // FILE MENU ITEMS
        JMenuItem ji1 = new JMenuItem("NEW TAB");
        JMenuItem ji2 = new JMenuItem("ABOUT");
        JMenuItem ji3 = new JMenuItem("OPEN");
        JMenuItem ji4 = new JMenuItem("SAVE");
        JMenuItem ji5 = new JMenuItem("exit");

        jm1.add(ji1);
        jm1.add(ji2);
        jm1.add(ji3);
        jm1.add(ji4);
        jm1.add(ji5);

        // EDIT MENU ITEMS
        JMenuItem ji7 = new JMenuItem("UNDO");
        JMenuItem ji8 = new JMenuItem("CUT");
        JMenuItem ji9 = new JMenuItem("COPY");
        JMenuItem ji10 = new JMenuItem("PASTE");
        JMenuItem ji11 = new JMenuItem("DELETE");
        JMenuItem ji12 = new JMenuItem("FONT");

        jm2.add(ji7);
        jm2.add(ji8);
        jm2.add(ji9);
        jm2.add(ji10);
        jm2.add(ji11);
        jm2.add(ji12);

        // VIEW MENU ITEMS
        JMenuItem ji13 = new JMenuItem("ZOOM");
        JMenuItem ji14 = new JMenuItem("STATUS BAR");
        JMenuItem ji15 = new JMenuItem("WORD WRAP");

        jm3.add(ji13);
        jm3.add(ji14);
        jm3.add(ji15);


			// CLICK EVENT
        ji1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(jf, "TEE NEW FILIE MA CLICK KAYRU");
            }
        });
	
	
			// CLICK EVENT
		ji2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(jf, "TE ABOUT CLICK KAYRU ");
            }
        });
		
		// EXIT
		ji5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
				System.exit(0);
            }
        });

        // ADD MENUS
        mb.add(jm1);
        mb.add(jm2);
        mb.add(jm3);

        jf.setJMenuBar(mb);

        jf.setVisible(true);
    }
}
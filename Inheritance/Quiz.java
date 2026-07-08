import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 9.
// Swing – Quiz Application [20 Marks]
// Design a Simple Quiz Application using Java Swing with 3 multiple-choice questions (Java-based):
//   • JLabel to display the question number and question text.
//   • 4 JRadioButton options for each question (use ButtonGroup).
//   • JButton — 'Next' and 'Submit'.
//   • JLabel to display the final score after Submit is clicked.
//   • Logic:
//       – Store questions, options, and correct answers in arrays.
//       – On 'Next' → validate selection, move to next question, update question and options.
//       – On 'Submit' → calculate total score out of 3 and display it.
//   • Use BorderLayout: question at NORTH, options at CENTER, buttons at SOUTH.
class Quiz
{
    static int qno = 0, score=0;

    static String ques[]=
    {
        "JVM stands for?",
        "Keyword for inheritance?",
        "Method to start thread?"
    };

    static String opt[][] = 
    {
        {"Java Virtual Machine", "Java Variable", "None"},
        {"this", "extends", "implements"},
        {"run()", "start()", "main()"}
        
    };

    static int ans[] ={0,1,1};

    public static void main(String[] args) 
    {
            JFrame frame = new JFrame("QUIZ");
            frame.setLayout(new BorderLayout());
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setSize(500,500);


            JLabel questions = new JLabel(ques[qno]);


            JRadioButton r1 = new JRadioButton(opt[qno][0]);
            JRadioButton r2 = new JRadioButton(opt[qno][1]);
            JRadioButton r3 = new JRadioButton(opt[qno][2]);


            //BUTTON GROUP FOR CHOOSING ONE OPTION
            ButtonGroup bg = new ButtonGroup();
            bg.add(r1);
            bg.add(r2);
            bg.add(r3);

            //PANEL to contain RadioButton 
            //center panel
            JPanel cp = new JPanel(new GridLayout(12,1));
            cp.add(r1);
            cp.add(r2);
            cp.add(r3);

            JButton next = new JButton("Next");
            JButton submit = new JButton("Submit");
            JLabel displayScore = new JLabel("");

            //south panel
            JPanel sp = new JPanel();
            sp.add(next);
            sp.add(submit);
            sp.add(displayScore);


            //NEXT QUETIONS
            next.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // LOGIC
                    int selected = -1;

                    if(r1.isSelected())
                    {
                        selected = 0;
                    }
                    else if(r2.isSelected())
                    {
                        selected = 1;
                    }
                    else if(r3.isSelected())
                    {
                        selected = 2;
                    }

                    if(selected == ans[qno])
                    {
                        score++;
                    }

                    qno++;

                    //NEXT QUESTION
                    if(qno < ques.length)
                    {
                        questions.setText(ques[qno]);

                        r1.setText(opt[qno][0]);
                        r2.setText(opt[qno][1]);
                        r3.setText(opt[qno][2]);

                        //TO CLEAR THE SELECTION OF THE RADIO BUTTON
                        bg.clearSelection();
                    }
                    else
                    {
                        //next button will not be clicked
                        next.setEnabled(false);
                    }

                }
            });

        //SUBMIT BUTTON
        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent er)
            {

                displayScore.setText("Score: "+score+" /3");

            }
        });


            frame.add(questions, BorderLayout.NORTH);
            frame.add(cp, BorderLayout.CENTER);
            frame.add(sp, BorderLayout.SOUTH);
            frame.setVisible(true);
            
    }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // Needed for button clicks

class ToDoManager
{
    // We keep track of the count globally so both buttons can see it
    static int taskCount = 0;

    public static void main(String[] args) {
        // 1. Create the Frame (The Main Window)
        JFrame frame = new JFrame("To-Do List Manager");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // By default, JFrame uses BorderLayout - North, South, East, West, Center
        frame.setLayout(new BorderLayout());

        // --- NORTH SECTION (The Input Bar) ---
        JPanel topPanel = new JPanel(); 
        topPanel.setLayout(new FlowLayout()); // Buttons/Text line up in a row

        JLabel taskLabel = new JLabel("Task:");
        JTextField inputField = new JTextField(15);
        JButton addButton = new JButton("Add Task");
        JButton clearButton = new JButton("Clear All");

        topPanel.add(taskLabel);
        topPanel.add(inputField);
        topPanel.add(addButton);
        topPanel.add(clearButton);
        
        frame.add(topPanel, BorderLayout.NORTH); // Stick the panel at the top



        // --- CENTER SECTION (The List Area) ---
        JTextArea textArea = new JTextArea("No tasks yet. Add one above!");
        textArea.setEditable(false); // User cannot type directly in the list
        
        // Wrap the text area in a ScrollPane so we can scroll if the list is long
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER); // Fill the middle space




        // --- SOUTH SECTION (The Counter) ---
        JLabel countLabel = new JLabel("Total Tasks: 0");
        frame.add(countLabel, BorderLayout.SOUTH); // Stick at the bottom

        
        
        // --- THE LOGIC (Button Clicks) ---
        
        // When 'Add Task' is clicked
        addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String task = inputField.getText();
                if (!task.isEmpty()) 
                {
                    if (taskCount == 0) 
                    {
                        textArea.setText("");
                    }

                    taskCount++;
                    // Append the task with a serial number
                    textArea.append(taskCount + ". " + task + "\n");
                    inputField.setText(""); // Clear the input box
                    countLabel.setText("Total Tasks: " + taskCount); // Update count
                }
            }
        });

        // When 'Clear All' is clicked
        clearButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                textArea.setText("No tasks yet. Add one above!"); // Clear the list
                taskCount = 0;        // Reset the counter
                countLabel.setText("Total Tasks: 0"); // Update label
            }
        });

        frame.setVisible(true);
    }
}
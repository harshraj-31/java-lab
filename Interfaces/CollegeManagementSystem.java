import java.util.*; // Importing utility package (Scanner class for input)

// ---------------------- CUSTOM EXCEPTION ----------------------
class InvalidMarksException extends Exception 
{
    // Constructor for custom exception
    public InvalidMarksException(String msg) 
    {
        super(msg); // Calling parent (Exception) constructor
    }
}

// ---------------------- INTERFACE ----------------------
interface Exam 
{
    // Method declaration (no body) → must be implemented
    void enterMarks(int marks) throws InvalidMarksException;

    void calculateGrade();
}

// ---------------------- ABSTRACT CLASS ----------------------
abstract class Person 
{
    private int id;          // private → accessible only within class
    protected String name;   // protected → accessible in subclass

    public final String collegeName = " College"; // constant (cannot change)

    // Parameterized constructor
    Person(int id, String name) 
    {
        this.id = id;     // this refers to current object
        this.name = name;
    }

    // Getter method for id (Encapsulation)
    public int getId() 
    {
        return id;
    }

    // Getter method for name
    public String getName() 
    {
        return name;
    }

    // Abstract method (must be implemented in subclass)
    public abstract void display();
}

// ---------------------- DERIVED CLASS ----------------------
class Student extends Person implements Exam 
{
    private int marks;      // stores marks
    private String grade;   // stores grade

    // Constructor
    Student(int id, String name)
    {
        super(id, name); // calling parent constructor
    }

    // Implementing interface method
    public void enterMarks(int marks) throws InvalidMarksException 
    {
        // Validation check
        if(marks < 0 || marks > 100) 
        {
            // Throwing custom exception
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        this.marks = marks; // assigning value
    }

    // Calculating grade based on marks
    public void calculateGrade()
    {
        if (marks >= 90)
            grade = "A";
        else if (marks >= 75)
            grade = "B";
        else if (marks >= 50)
            grade = "C";
        else
            grade = "Fail";
    }

    // Overriding abstract method of Person class
    @Override
    public void display() 
    {
        System.out.println("College: " + collegeName); // final variable
        System.out.println("ID: " + getId());          // accessing private via getter
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// ---------------------- MAIN CLASS ----------------------
public class CollegeManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // Scanner object for input
        Student s = null; // reference variable (no object yet)

        // Infinite loop for menu
        while (true) 
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Create Student");
            System.out.println("2. Enter Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt(); // taking user input

            switch (ch) 
            {
                case 1:
                    // Creating student object
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    s = new Student(id, name); // object creation
                    break;

                case 2:
                    try 
                    {
                        // Entering marks
                        if (s == null) 
                        {
                            System.out.println("Please create student first!");
                            break;
                        }

                        System.out.print("Enter Marks: ");
                        int m = sc.nextInt();

                        s.enterMarks(m); // may throw exception
                    } 
                    catch (InvalidMarksException e) 
                    {
                        // Handling custom exception
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;

                case 3:
                    if (s == null) 
                    {
                        System.out.println("Please create student first!");
                        break;
                    }

                    s.calculateGrade(); // method call
                    System.out.println("Grade calculated.");
                    break;

                case 4:
                    if (s == null) 
                    {
                        System.out.println("Please create student first!");
                        break;
                    }

                    s.display(); // displaying data
                    break;

                case 5:
                    System.exit(0); // terminate program

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
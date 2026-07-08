import java.util.*;


//custom exception used when marks are < 0 or >  100
class InvalidMarksException extends Exception
{

    InvalidMarksException(String msg) 
    {
        super(msg);
    }    
}

//only define methods(no body) used for multiple inheritance
//1.No constructors
//2.Variables are by default final & static
//3.Supports multiple inheritance
interface Exam
{
    public void enterMarks(int marks) throws InvalidMarksException;

    public void calculateGrade();
}

//cannot create its object,
//can have abstract methods(no body) & normal methods (with body)
abstract class Person
{
    private int id;
    protected String name;

    Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    //Encapsulation (getter/setter methods)
    public int getId()
    {
        return id;
    }
    //Encapsulation (getter/setter methods)
    public String getName()
    {
        return name;
    }

    //Abstraction method has no body,
    //in short, it focuses on What to do instead of how to do
    //every child must implement it 
    //Every Person must have a display() method, but I won’t define how."
    abstract void display();

}

// Encapsulation → Hide data
// Abstraction → Hide logic

class Student extends Person implements Exam
{
    private int marks;
    private String grade;

    Student(int id, String name) 
    {
        super(id,name);
    }

    @Override
    public void enterMarks(int marks) throws InvalidMarksException
    {
        if (marks < 0 || marks > 100)
        {
            throw new InvalidMarksException("Invalid Marks, try again");
        }
        else
        {
            this.marks = marks;
            System.out.println("Marks assigned");
        }
    }   
    public void calculateGrade()
    {
        if(marks >= 90)
        {
            grade = "A";
        }
        else if(marks >=75)
        {
            grade = "B";
        }
        else if (marks >= 50)
        {
            grade = "C";
        }
        else if(marks < 50)
        {
            grade = "Fail";
        }

        System.out.println("Grade calculated!");
    }


    @Override
    void display()
    {
        System.out.println("----STUDENT DETAILS----");
        System.out.println("ID: "+getId());
        System.out.println("NAME: "+getName());
        System.out.println("MARKS: "+marks);
        System.out.println("GRADE: "+grade);
    }
    
}


class CollegeDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id: ");
        int id = sc.nextInt();
        System.out.println("Enter the student name: ");
        String nm = sc.next();

        Student st1 = new Student(id,nm);
        int ch;
        do
        {
            System.out.println("1.Enter marks");
            System.out.println("2.Calculate Grade");
            System.out.println("3.Display Student");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    try
                    {
                        System.out.println("Enter marks: ");
                        int mrks = sc.nextInt();
                        st1.enterMarks(mrks);
                        
                    }catch(InvalidMarksException e)
                    {
                        System.out.println("Error: "+e.getMessage());
                    };
                    break;

                case 2:
                    st1.calculateGrade();
                    break;

                case 3:
                    st1.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Invalid choice try again");
            }
        }while(ch!=4);
    
    }
}
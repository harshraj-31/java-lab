abstract class Student
{
    String sid, sname;
    final String schoolName = "ABC School";

    Student(String sid, String sname)
    {
        this.sid = sid;
        this.sname = sname;
    }

    final void displayInfo()
    {
        System.out.println("School Name : " + schoolName);
        System.out.println("Student ID  : " + sid);
        System.out.println("Student Name: " + sname);
    }

    abstract public void calculateGrade();
}

// Science Student
class SStudent extends Student
{
    int marks;

    SStudent(String sid, String sname, int marks)
    {
        super(sid, sname);
        this.marks = marks;
    }

    public void calculateGrade()
    {
        if (marks >= 80)
            System.out.println("GRADE A");
        else
            System.out.println("GRADE B");
    }
}

// Arts Student
class ArtsStudent extends Student
{
    int marks;

    ArtsStudent(String sid, String sname, int marks)
    {
        super(sid, sname);
        this.marks = marks;
    }

    public void calculateGrade()
    {
        if (marks >= 70)
            System.out.println("GRADE A");
        else
            System.out.println("GRADE B");
    }
}

// Main class
public class ScienceStudent
{
    public static void main(String args[])
    {
        SStudent s = new SStudent("101", "JOHN", 90);
        s.displayInfo();
        s.calculateGrade();
    }
}

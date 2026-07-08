import java.util.*;
class Student
{
    int Rollno,marks1,marks2,total;
    float avg;
    String name;

     void displayStudentDetails(int r, String n, int m1, int m2) 
     {
        Rollno = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
        total = m1 + m2;
        avg = total / 2.0f;

        System.out.println("Roll No : " + Rollno);
        System.out.println("Name    : " + name);
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + avg);
        System.out.println("------------------------");
     }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // First student object
        Student s1 = new Student();
        System.out.println("Enter ROllNO: ");
        int rollno = sc.nextInt();
        
        System.out.println("Enter the Name: ");
        Scanner sc1 = new Scanner(System.in);
        String nm = sc1.nextLine();

        System.out.println("Enter Marks1: ");
        int m1 = sc.nextInt();
        
        System.out.println("Enter Marks 2");
        int m2 = sc.nextInt();

        s1.displayStudentDetails(rollno, nm, m1,m2);



        //Second object 
        // Student s2 = new Student();
        // s2.displayStudentDetails(21, "Anas",65,77);

    }
}
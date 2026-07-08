import java.util.*;
class Student
{
    int rollno, m1, m2, m3, total;
    float avg;
    String name;

    Student()
    {
        rollno = 0;
        name = "";
        m1 = m2 = m3 = 0;
    }
	
    Student(int rollno, String name, int m1, int m2, int m3)
    {
        this.rollno = rollno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    void cal()
    {
        total = m1 + m2 + m3;
        avg = total / 3.0f;
    }
    void display()
    {
        System.out.println(rollno + "\t" + name + "\t" + total + "\t" + avg);
    }
}

class STUD_MARKSHEET
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE N : ");
        int n = sc.nextInt();

        Student e[] = new Student[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("ENTER ROLL NO : ");
            int rollno = sc.nextInt();

            System.out.print("ENTER NAME : ");
            String name = sc.next();

            System.out.print("ENTER M1 : ");
            int m1 = sc.nextInt();

            System.out.print("ENTER M2 : ");
            int m2 = sc.nextInt();

            System.out.print("ENTER M3 : ");
            int m3 = sc.nextInt();

            e[i] = new Student(rollno, name, m1, m2, m3);
            e[i].cal();
        }

        System.out.println("\n=> STUDENT MARKSHEET <=");
        System.out.println("ROLL NO\tNAME\tTOTAL\tAVG");

        for(int i = 0; i < n; i++)
        {
            e[i].display();
        }
    }
}

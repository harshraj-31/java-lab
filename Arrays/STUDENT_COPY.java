import java.util.*;

class TryDemo
{
    String name;
    int rollno, m1, m2, m3, total;
	float avg;

     TryDemo()
     {
     name = "JAY";
     rollno = 50;
     m1 = m2 = m3 = 0;
    }

    TryDemo(String name, int rollno, int m1, int m2, int m3)
    {
        this.name = name;
        this.rollno = rollno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    TryDemo(TryDemo h)
    {
        name = h.name;
        rollno = h.rollno;
        m1 = h.m1;
        m2 = h.m2;
        m3 = h.m3;
    }

    void cal()
    {
        total = m1 + m2 + m3;
		avg = total  / 3.0;
    }

    void display()
    {
        cal();
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Total Marks: " + total);
		System.out.println("avg: " + avg);
    }
}
class STUDENT_COPY
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();

        System.out.print("Enter m1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter m2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter m3: ");
        int m3 = sc.nextInt();

        TryDemo obj2 = new TryDemo(name, rollno, m1, m2, m3);
        obj2.display();

        TryDemo obj3 = new TryDemo(obj2);
        obj3.display();
    }
}

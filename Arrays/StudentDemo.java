import java.util.*;

class Student
{
     int rollno;
     String name;
     int m1,m2,m3;
     int total;
     double avg;

     Student() // Default Constructor (Automaticall set everything 0)
     {

     }
     Student(int rollno, String name, int m1, int m2, int m3) // Parametized Construcor
     {
          this.rollno = rollno;
          this.name = name;
          this.m1  = m1;
          this.m2 = m2;
          this.m3 = m3;
     }

     void claculateMarksheet() // calculating total and avg
     {
          total = m1+m2+m3;
          avg = total/3.0;
     }

     void displayMarksheet() // Displaying Marksheet in tabular Format
     {
          System.out.println("\tRollno"+rollno+"\t"+name+"\t\t"+m1+"\t"+m2+"\t"+m3+"\t"+total+"\t"+avg+"\n");
     }
}

class StudentDemo
{
     public static void main(String[] args) 
     {
          Scanner sc = new Scanner(System.in);
          Scanner sc1 = new Scanner(System.in);

          System.out.println("Enter how many students: ");
          int n = sc.nextInt();

          Student s[] = new Student[n];

          for(int i=0;i<n;i++)
          {
               System.out.println("\tEnter Student Rollno: ");
               int rn = sc.nextInt();

               System.out.println("\tEnter Student Name: ");
               String sn = sc1.nextLine();

               System.out.println("\tEnter Mark 1 : ");
               int mark1 = sc.nextInt();

               System.out.println("\tEnter Mark 2 : ");
               int mark2 = sc.nextInt();

               System.out.println("\tEnter Mark 3 : ");
               int mark3 = sc.nextInt();


               //Default Constructor
               // Student s1 = new Student();


               //call parameterized constructor of clas
               s[i] = new Student(rn,sn,mark1,mark2,mark3);
               s[i].claculateMarksheet();
          }

          System.out.print("\n\tStudent Information are...\n");
          System.out.print("\n\tRollno\tName\t\tMark1\tMark2\tMark3\tTotal\tAverage\n");
          System.out.println("\t____________________________________________________________________");

          for(int i=0;i<n;i++)
          {
               s[i].displayMarksheet();
          }
     }
}
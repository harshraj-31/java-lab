import java.io.*;
import java.util.*;

class STUDENT_RAF_WITH_GRADE_SEARCH
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            RandomAccessFile file = new RandomAccessFile("STUD", "rw");

            System.out.println("ENTER NUMBER OF STUDENTS:");
            int n = sc.nextInt();

            // WRITE DATA
            for(int i = 0; i < n; i++)
            {
                System.out.println("ENTER DETAILS OF STUDENT " + (i+1));

                System.out.print("ID: ");
                int id = sc.nextInt();

                System.out.print("NAME: ");
                String name = sc.next();

                System.out.print("MARKS: ");
                double marks = sc.nextDouble();

                System.out.print("GRADE: ");
                char grade = sc.next().charAt(0);

                file.writeInt(id);
                file.writeUTF(name);
                file.writeDouble(marks);
                file.writeChar(grade);
            }

            //SEARCH PART
            System.out.println("\nENTER ID TO SEARCH:");
            int searchId = sc.nextInt();

            file.seek(0);
            boolean found = false;

            while(file.getFilePointer() < file.length())
            {
                int id = file.readInt();
                String name = file.readUTF();
                double marks = file.readDouble();
                char grade = file.readChar();

                if(id == searchId)
                {
                    System.out.println("\nSTUDENT FOUND ");
                    System.out.println(id + " " + name + " " + marks + " " + grade);
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                System.out.println("STUDENT NOT FOUND ");
            }

            file.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
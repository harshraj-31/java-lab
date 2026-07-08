import java.io.*;
import java.util.*;

class STUDENT_RAF_WITH_GRADE
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            
            RandomAccessFile file = new RandomAccessFile("STUD", "rw");

            System.out.println("ENTER THE NUMBER");
            int n = sc.nextInt();

            for(int i = 0; i < n; i++)
            {
                System.out.println("ENTER THE DETAILS OF STUDENT " + (i+1));

                System.out.println("ENTER THE ID");
                int id = sc.nextInt();

                System.out.println("ENTER THE NAME");
                String name = sc.next();

                System.out.println("ENTER THE MARKS");
                double marks = sc.nextDouble();

                System.out.println("ENTER THE GRADE:");
                char grade = sc.next().charAt(0);

                file.writeInt(id);
                file.writeUTF(name);
                file.writeDouble(marks);
                file.writeChar(grade);
            }

            file.seek(0);

            System.out.println("\nSTUDENT RECORDS");

            while(file.getFilePointer() < file.length())
            {
                int id = file.readInt();
                String name = file.readUTF();
                double marks = file.readDouble();
                char grade = file.readChar();

                System.out.println(id + " " + name + " " + marks + " " + grade);
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
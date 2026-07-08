import java.io.*;
import java.util.*;
public class MKDIR
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FOLDER NAME:");
        String foldername = sc.next();

        File folder = new File(foldername);

        if (!folder.exists())
        {
            if (folder.mkdir())
            {
                System.out.println("Folder created successfully");
            }
            else
            {
                System.out.println("Unable to create folder");
            }
        }
        else
        {
            System.out.println("Folder already exists");
        }

        sc.close(); // good practice
    }
}
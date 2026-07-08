import java.io.*;
import java.util.*;

public class FILEHANDLING
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME");
        String filename = sc.next();
        
        File file = new File(filename);
        try
        {
            if(file.createNewFile())
            {
                System.out.println("File " + filename + " created successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("AN ERROR OCCURED WHILE CREATING A FILE");
        }
    }
}
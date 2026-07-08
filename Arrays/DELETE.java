import java.io.*;
import java.util.*;

public class DELETE
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FILE NAME:");
        String filename = sc.next();
        
        File file = new File(filename);
        
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("File " + filename + " deleted successfully");
            }
            else
            {
                System.out.println("Unable to delete the file");
            }
        }
        else
        {
            System.out.println("File does not exist");
        }
    }
}
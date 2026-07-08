import java.io.*;
import java.util.*;

class CreateFile
{
    public static void main(String[] args) 
    {
        //Scanning file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  full file name: ");
        
        //File path
        String file = sc.next();

        //passing file path to file object
        File f = new File(file);

        try
        {
            if(f.createNewFile())
            {
                System.out.println(f+" Created");
            }
            else
            {
                System.out.println("FIle already exists");
            }
        }catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }


    }
}
import java.io.*;
import java.util.*;

class DeleteFile
{
    public static void main(String[] args) 
    {
        //Scanning file name 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full file name: ");
        String fileName = sc.next();


        //creating a file object and passing file name
        File f = new File(fileName);

        try
        {
            //check if the file exists before deleting
            if(f.exists())
            {
                //Attempt to delete the file
                if(f.delete()) // Delete Existing File
                {
                    System.out.println(f.getName()+" file deleted successfully");
                }
                else
                {
                    System.out.println("Failed to delete file.");
                }
            }
            else
            {
                System.out.println("The file Does not exist.");
            }
        }catch(Exception e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
import java.io.*;
import java.util.*;

public class SUBFOLDER
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
                return; // stop if main folder not created
            }
        }
        else
        {
            System.out.println("Folder already exists");
        }

        // Subfolders
        String[] subfoldername = {"UDHISTHIR","BHIM","ARJUN","NAKUL","SHADEV"};

        for(String subfolder : subfoldername)
        {
            File fs = new File(foldername + "/" + subfolder);

            if(!fs.exists())
            {
                if(fs.mkdir())
                {
                    System.out.println("SECTION FOLDER " + subfolder + " CREATED SUCCESSFULLY");
                }
                else
                {
                    System.out.println("FAILED TO CREATE " + subfolder);
                }
            }
            else
            {
                System.out.println("SECTION FOLDER " + subfolder + " ALREADY EXISTS");
            }
        }
    }
}
import java.io.File;
import java.util.*;

class CreateFolder
{
    public static void main(String[] args) 
    {
        //Scanning file name 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Folder name: ");
        String folderName = sc.next();

        //creating a file object and passing file name
        File folder = new File(folderName);

        //check if the folder already exists else error message
        if(!folder.exists())
        {
            //Check if the folder is created Using mkdir() method else error message
            if(folder.mkdir())
            {
                System.out.println("Folder "+folder.getName()+" Created Successfully!");
            }
            else
            {
                System.out.println("Failed to create the folder");
            }
        }
        else
        {
            System.out.println("The Folder Already Exists");
        }
    }
}
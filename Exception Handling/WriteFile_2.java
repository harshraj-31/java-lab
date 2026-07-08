import java.io.*;
import java.util.*;

// class WriteFile
// {
//     public static void main(String[] args) 
//     {

//         try
//         {
//             FileWriter fw = new FileWriter("new.txt");    
//             fw.write("Hello Print");
//             fw.close();
//             System.out.println("Successfully wrote to file");
//         }catch(IOException e)
//         {
//             System.out.println("An error occured while Writing to a file");
//             e.printStackTrace();
//         }
//     }
    
// }


class WriteFile
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full File name: ");
        String fileName = sc.next();

        try
            {
                //If you want to append then write FileWriter fw =new FileWriter(fileName, true); <-true represents append mode
                FileWriter fw =new FileWriter(fileName);
                fw.write("STiLLNESS iS THE KEY");
                fw.close();
                System.out.println("Successfully wrote in the file");

            }catch(IOException e)
            {
                System.out.println("Error : "+e.getMessage());
            }
    }
    
}
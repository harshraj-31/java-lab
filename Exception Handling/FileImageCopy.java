import java.io.*;

class FileImageCopy
{
    public static void main(String[] args)  throws IOException
    {
        //Open file for reading  
        //(give path if not in same folder)
        FileInputStream fis = new FileInputStream("C:\\Users\\KARAN\\OneDrive\\Pictures\\BATMAN.jpeg");

        //Destination image (new file will be created)
        FileOutputStream fos = new FileOutputStream("CopyImage.jpeg");


        int data;

        // read() → reads one byte at a time
        // returns -1 when file ends
        while( (data=fis.read())!=-1 )
        {
            // write() writes byte to new file
            fos.write(data);
            
        }
        System.out.println("\nCHECK, Image Copied Successfully!");
        fis.close();
        fos.close();
    }
}
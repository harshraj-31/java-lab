import java.io.FileInputStream;
import java.io.IOException;

class FileIORead
{
    public static void main(String[] args)  throws IOException
    {
        //Open file for reading
        FileInputStream fis = new FileInputStream("fos.txt");

        int data;
        
        // read() → reads one byte at a time
        // returns -1 when file ends
        while( (data=fis.read())!=-1 )
        {
            System.out.println((char)data);
        }
        System.out.println("\nFile Readed Successfully!");
        fis.close();
    }
}
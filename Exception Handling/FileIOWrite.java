import java.io.*;

class FileIOWrite
{
    public static void main(String[] args) throws IOException
    {
       
        //Create FileOutputStream (creates file if not exists)
        FileOutputStream fos = new FileOutputStream("fos.txt");  

        
        fos.write(74);
        //74 → 'J',
        
        fos.write(75);
        //75 → 'K'

        System.out.println("DONE!");
    }
}

 //used for writing binary data

    //  FileInputStream / FileOutputStream Methods

// Class	            Method	             Description
// FileInputStream	      read()	            Reads one byte
// FileInputStream	      close()	            Closes the stream

// FileOutputStream	  write(int)	        Writes one byte
// FileOutputStream	  close()	             Closes the stream
import java.io.*;

class BufferedWriterExample
{
    public static void main(String[] args)  throws IOException
    {
       BufferedWriter bw = new BufferedWriter(new FileWriter("new.txt",true)); // <-true for append in file
       bw.write("\nFast Writing using buffer");
       bw.close();

       System.out.println("Data written Successfully");
    }
}
    
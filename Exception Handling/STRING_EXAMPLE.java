import java.io.*;
class STRING_EXAMPLE
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream four = new FileOutputStream("MYFILE");
            String data = "HELLO ";

            four.write(data.getBytes());
            four.close();

            FileInputStream fin = new FileInputStream("MYFILE");
            int i;
            while((i = fin.read()) != -1)
            {
                System.out.print((char)i); 
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
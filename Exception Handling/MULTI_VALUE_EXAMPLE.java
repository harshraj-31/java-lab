import java.io.*;

class MULTI_VALUE_EXAMPLE
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream four = new FileOutputStream("MULTI");

            four.write('x');
            four.write('y');
            four.write('z');

            four.close();

            FileInputStream fin = new FileInputStream("MULTI");

            int i;
            while((i = fin.read()) != -1)
            {
                System.out.print((char)i + " ");
            }

            fin.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
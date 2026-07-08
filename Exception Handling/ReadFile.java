import java.io.*;

class ReadFile
{
   public static void main(String[] args) 
   {
        try
        {
            
            FileReader fr = new FileReader("new.txt");

            //fr.read() reads one character at a time from the file.
            //But it returns an int, not a char.
            int ch;
            while((ch=fr.read())!=-1) //-1 → indicates end of file.
            {

            //once fr.read() returns an int, ch is an integer.
            //But we want to print the actual character, not its numeric ASCII/Unicode value.
            //👉 So we convert (type cast): (char) ch

                System.out.println((char)ch);
                
            }     
            fr.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }    
   } 
}
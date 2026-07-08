import java.util.*;
import java.io.*;

class MERGE_FILE
{
    public static void main(String args[]) throws Exception
    {
        BufferedWriter bw = new BufferedWriter(new FileWriter("OUTPUT"));

        BufferedReader br1 = new BufferedReader(new FileReader("JAY"));
        BufferedReader br2 = new BufferedReader(new FileReader("MYFILE"));

        String line;

        while((line = br1.readLine()) != null)
        {
            bw.write(line);
            bw.newLine();
        }

        while((line = br2.readLine()) != null)
        {
            bw.write(line);
            bw.newLine();
        }

        br1.close();
        br2.close();
        bw.close();

        System.out.println("FILE CREATED AND MERGE DONE");
    }
}
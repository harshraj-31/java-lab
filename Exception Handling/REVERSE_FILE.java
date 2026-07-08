import java.util.*;
import java.io.*;

class REVERSE_FILE
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("JAY"));
        StringBuilder sb = new StringBuilder();

        String line;

        while((line = br.readLine()) != null)
        {
		sb.append(line).append("\n");
		}
		br.close();
		sb.reverse();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("OUTPUT2"));
		bw.write(sb.toString());
		bw.close();
        System.out.println("FILE REVERSE DONE");
    }
}
import java.util.*;
import java.io.*;

class SEARCH_WORD
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("MERGE_FILE"));
        String line;
		String word="class";
		int count=0;
	
        while((line = br.readLine()) != null)
        {
		if(line.contains(word))
			{
			count++;
			}

		}
		br.close();
		System.out.println(" words founds "+ count + " times ");
    }
}
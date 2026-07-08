import java.util.*;
import java.io.*;

class FILE_REDER_DEMO
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("\n\n ENTER THE FILE NAME  => ");
			String filename=sc.next();
			
			FileReader fr = new FileReader(filename);
			
			int i;
			while((i=fr.read())!=-1)
			{
				 System.out.print((char)i);
			}
			fr.close();
		}
		catch(IOException e){}
	}
}
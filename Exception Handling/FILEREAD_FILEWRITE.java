import java.util.*;
import java.io.*;
class FILEREAD_FILEWRITE
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("\n\n ENTER THE FILE NAME  => ");
			String filename=sc.next();
			
			System.out.println("\n\n ENTER DESTINATION FILE NAME  => ");
			String desc=sc.next();
			
			
			FileReader fr = new FileReader(filename);
			FileWriter fw = new FileWriter(desc);
			
			int i;
			while((i=fr.read())!=-1)
			{
				 System.out.print((char)i);
				 fw.write((char)i);
			}
			fr.close();
			fw.close();
		}
		catch(IOException e){}
	}
}
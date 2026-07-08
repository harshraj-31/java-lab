import java.io.*;
import java.util.*;
public class FILE_WRITE_DEMO
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw=new FileWriter("MYFILE",true);
			
			for(int i=1;i<=10;i++)
			{
				fw.write("AVO NE VALAM AAVO NEE" + i + "\n");
			}
			fw.close();
		}
		catch (IOException e){}
	}
}

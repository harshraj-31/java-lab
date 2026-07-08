import java.io.*;
class MERGE_FILES_STRINGS
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin1 = new FileInputStream("JAY");
			FileInputStream fin2 = new FileInputStream("MULTI");
			FileOutputStream fout = new FileOutputStream("MERGE_FILES");
			
			int i;
			
			while((i = fin1.read())!= -1)
			{
					fout.write(i);
			}
			while((i = fin2.read())!= -1)
				{
					fout.write(i);					
				}
			
				fin1.close();
				fin2.close();
				fout.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
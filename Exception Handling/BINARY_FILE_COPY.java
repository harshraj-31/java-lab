import java.io.*;

class BINARY_FILE_COPY
{
	public static void main(String args[]) 
	{
		String SourceFile="god.jpg";
		String DestinationFile ="copy.jpg";
		try
		{
			FileInputStream fi = new FileInputStream(SourceFile);
			FileOutputStream fo = new FileOutputStream(DestinationFile);
			
				int bytesRead;
				
				while((bytesRead = fi.read())!= -1)
				{
					fo.write(bytesRead);
				}
			System.out.println("FILE COPY DONE");
		}
		catch(Exception e)
		{
			System.out.println("ERROR TO COPY FILE ");
			
		}
		
	}
	
}



import java.io.*;

class STUDENT_SCANNER_DATA
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			DataOutputStream dout = new DataOutputStream(new FileOutputStream("STUDENT"));
			
			System.out.println("ENTER THE SYUDENT NUMBER");
			int n=sc.nextInt();
			
			for(int i = 0;i<=n;i++)
			{
				
				System.out.println("ENTER THE DETAILS OF STUDENT "+(i+1));
				
				System.out.println("ENTER THE ID");
				int id=sc.nextInt();
				
				System.out.println("ENTER THE NAME");
				String name=sc.next();
				
				System.out.println("ENTER THE GENDER");
				char gen=(sc.next()).charAt(0);
				
				System.out.println("ENTER THE MARKS");
			    double  marks=sc.nextDouble();
				
				dout.writeInt(id);
				dout.writeUTF(name);
				dout.writeChar(gen);
				dout.writeDouble(marks);				
				
			}
			dout.close();
			
			DataInputStream din = new DataInputStream(new FileInputStream("STUDENT"));
			
			System.out.println("\n STUDENT RECORDS ");
			
			while(din.availble()>0)
			{
				int id=din.availble();
				String name=din.availble();
				char gen= din.availble();
				double marks=din.availble();
				
				System.out.println(id+" "+ name+" "+gen+ " "+marks);
			}
			din.close();
			sc.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
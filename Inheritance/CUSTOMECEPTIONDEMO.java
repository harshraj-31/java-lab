import java.util.*;
import static java.lang.System.out;

class INVALID_SALARY_EXCEPTION extends Exception
{
		INVALID_SALARY_EXCEPTION(String msg)
		{
		super(msg);
		}
}
class CUSTOMECEPTIONDEMO
{
	public static void main(String args[])
	{
		
		try
		{
			Scanner sc = new Scanner(System.in);
			int sal=sc.nextInt();
			
			if(sal<0)
			{
				throw new INVALID_SALARY_EXCEPTION("SALARY CANT'T BE NAGATIVE");
			}
			else
			{
				out.print("SALARY"+sal);
			}
		}
		catch (INVALID_SALARY_EXCEPTION ie)
		{
			out.print(ie.getMessage());
		}
	}
	
}
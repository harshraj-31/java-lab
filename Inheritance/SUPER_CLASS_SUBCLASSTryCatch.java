class SUPER_CLASS
{
	
	void show()
	{
		try 
		{
			SUB_CLASS obj = new SUB_CLASS();
			obj.display();
		}
		catch (ArrayIndexOutOfBoundsException extends)
			{
			System.out.println("HANDLED IN SUPER CLASS"+e);
			}
	}
}
class SUBCLASS extends SUPER_CLASS
{
	void display()
	{
		try
		{
			System.out.println("INSIDE SUBCLASS DSIPLAY()");

			int arr[]={10,20,30};
			System.out.println(arr[5]);
		}
		catch(NullPointerException e)
		{
			System.out.println("HANDLED IN SUBCLASS");
		}
	}
}

public class SUPER_CLASS_SUBCLASSTryCatch
{
	
	public static void main(String args[])
	{
		
	}
}
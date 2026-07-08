public class THROWDEMO
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("INSIDE TRY BLOCK");
			throw new NumberFormatException("CONNOT DEVIDE");
				
		}	
		catch(ArithmeticException e)
				{
					e.printStackTrace();
				}
	}
}
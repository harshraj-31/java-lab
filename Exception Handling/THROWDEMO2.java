public class THROWDEMO2
{
    
    static void divide(int a,int b)
    throws ArithmeticException,NumberFormatException
	{
		int result = a/b;
		System.out.println("RESULT"+result);
	}
    public static void main(String args[])
    {
	try
		{
		divide(10,0);
		}
	catch (ArithmeticException e)
		{
		System.out.println("EXCEPTION"+e.getMessage());
		}
	catch (NumberFormatException e)
		{
		System.out.println("EXCEPTION"+e.getMessage());
		}
		
    }

}
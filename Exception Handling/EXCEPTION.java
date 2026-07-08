	import java.util.*;
	class EXCEPTION
	{
		public static void main(String args[])
		{
		try
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER FIRST VALUE");
			int a = sc.nextInt();
			
			System.out.println("ENTER SECOND VALUE");
			int b = sc.nextInt();
			
			float c;
			c=a/b;
			System.out.println("DIVION IS "+c);
			}
			catch(ArrayIndexOutOfBoundsException e)
				{
				System.out.println("PLASE IN PUT 2 ELEMENTS"+e);
				}
			catch(NegativeArraySizeException e)
				{
				System.out.println("ARRAY SIZE CAN'T BE NAGATIVE"+e);
				}
			catch(ArithmeticException e)
				{
				System.out.println("CAN'T DEVIDE BY ZERO");		
				}
			catch(Exception e)
				{
				System.out.println("WELLCOM PRAGAYRAG EROOR"+e);		
				}
				finally
				{
					System.out.println("");
				}
		}
	}

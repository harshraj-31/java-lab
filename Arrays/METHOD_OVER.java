import java.util.*;
class   METHOD_OVER
{
	
	int cal(int a ,int b)
	{
		return a+b;
	}
	
	int cal(int a ,int b,int c)
	{
		return a+b+c;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		METHOD_OVER mobj = new METHOD_OVER();
		
		System . out. println("ENTER THE NAME");
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(mobj.cal(i,j));
		
		System . out. println("ENTER THE NAME");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(mobj.cal(x,y,z));
		
	}
}

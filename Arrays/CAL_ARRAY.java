import java.util.*;

class CAl_ARRAY
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE NUMBER");
		int n = sc.nextInt();

		int a[] = new int[n];
		int sum = 0;
		int avg=0;

		for(int i = 0; i < n; i++)   // FIX HERE
		{
			System.out.println("ENTER THE NUMBER " + (i+1));
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		avg = sum / n;
		System.out.println("SUM = " + sum);
		System.out.println("AVERAGE = " + avg);
	}
}

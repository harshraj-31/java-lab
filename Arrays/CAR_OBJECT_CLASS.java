import java.util.*;

class CAR_OBJECT_CLASS
{
	String brand, name;
	int model;

	void displadetils()
	{
		System.out.println("BRAND  " + brand);
		System.out.println("NAME   " + name);
		System.out.println("MODEL  " + model);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		CAR_OBJECT_CLASS cobj = new CAR_OBJECT_CLASS();

		System.out.println("ENTER THE BRAND");
		cobj.brand = sc.next();

		System.out.println("ENTER THE NAME");
		cobj.name = sc.next();

		System.out.println("ENTER THE MODEL");
		cobj.model = sc.nextInt();

		cobj.displadetils();
	}
}

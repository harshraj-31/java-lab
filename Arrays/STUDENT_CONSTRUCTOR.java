import java.util.*;
class  Student

{
	String name;
	int age ;
	Student()
	{
		name="JAY";
		age=18;
	}
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,int age)	
	{
			this.name=name;
			this.age=age;
	}
}
class  STUDENT_CONSTRUCTOR
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NAME");
		String name=sc.next();
		System.out.println("ENTER AGE" );
		int age=sc.nextInt();
		
		Student sobj1 = new Student();
		System.out.println("DEFAULT CON => " + sobj1.name + " " + sobj1.age);

		Student sobj2 = new Student(name);
		System.out.println("PARAMETER 1 => " + sobj2.name);

		Student sobj3 = new Student(name, age);
		System.out.println("PARAMETER 2 => " + sobj3.name + " AGE => " + sobj3.age);
		}
	
	
}
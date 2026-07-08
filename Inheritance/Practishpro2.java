abstract class Employee   //EMP CLASS
{
	String empid,empname;
	int salary;
	final String companyName="LJMCA";
	
	Employee()
	{
	
	}
	Employee(String empid,String empname,int salary)
	{
	this.empid=empid;
	this.empname=empname;
	this.salary=salary;
	}

    final void displasalary()
	{
	System.out.println("/n");		
	System.out.println("COMPANY NAME IS "+companyName);		
	System.out.println("NAME IS "+empname);		
	System.out.println("ID IS "+  empid);		
	System.out.println("SALARY IS"+salary);		
}
	
   abstract public void CalculateBouns(); // ABSTRACT METHOD HAVE NO BODY
}
class manager extends Employee // MANAGER CLASS
{
	double bouns;
	
	manager(String empid , String empname, int salary)
	{
			super(empid,empname,salary);
	}
	public void CalculateBouns()
	{
		bouns=salary*0.10;	
	}
}
class developer extends Employee // DEVLOPER CLASS
{
	double bouns;
	developer(String empid , String empname, int salary)
	{
			super(empid,empname,salary);
	}
	
	public void CalculateBouns()
	{
		bouns=salary*0.5;	
		System.out.println(bouns);
	}
}
class Practishpro2
{
	public static void main(String args[]) // MAIN METHOD
	{
	manager m = new manager("101","JOHN",50000);
	m.displasalary();
	m.CalculateBouns();
	}
}
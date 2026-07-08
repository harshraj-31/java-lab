import java.util.*;
class emp
{
	String empname;
	int empid;
	double basic,hra,da,pf,grosal;
	
	emp()
	{
		empid=10;
		empname="";
		basic=100000;
	}
	emp(int empid,String empname,double basic)
	{
		this.empid=empid;
		this.empname=empname;
		this.basic=basic;
	}
	
	void cal_salary()
	{
		hra=basic*0.10;
		da=basic*0.08;
		pf=basic*0.12;
		grosal=basic+hra+da-pf;
	}
	void display()
	{
		System.out.println("\n"+empid+"\t"+empname+"\t"+basic+"\t"+hra+"\t"+da+"\t"+pf+"\t"+grosal);
	}
	
}

class BASIC_SALARY
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		emp e[]=new emp[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("ENTER THE ID");
			int empid=sc.nextInt();
			
			System.out.println("ENTER THE NAME");
			String empname=sc.next();
			
			System.out.println("ENTER THE SALARY");
			double basic=sc.nextDouble();
			
			e[i]=new emp(empid,empname,basic);
			e[i].cal_salary();
		}
		System.out.println("\n EMP DETAILS");
		System.out.println("\nempid empname \t basic \t hra \t da \t pf \t grosal");

		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
	}
}
import java.util.*;
class STUDENT_DETAILS
{
	int rollno,marks1,marks2,total,avg;
	String name;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System .in);
		STUDENT_DETAILS SD = new STUDENT_DETAILS();
		
		System.out.println("ENTER THE ROLLNO");
		SD.rollno=sc.nextInt();
		System.out.println("ENTER THE NAME");
		SD.name=sc.next();
		System.out.println("ENTER THE MARKS 1");
		SD.marks1=sc.nextInt();
		System.out.println("ENTER THE MARKS 2");
		SD.marks2=sc.nextInt();
		
		
	
		SD.total=SD.marks1+SD.marks2;
		SD.avg=SD.total/2;
		SD.display();
	}
	void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(marks1);
		System.out.println(marks2);
		System.out.println(total);
		System.out.println(avg);
		
	}
}
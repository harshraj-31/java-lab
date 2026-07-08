import java.util.Scanner;

class InvalidSalaryException extends Exception 
{
    public InvalidSalaryException(String message) 
	{
        super(message);
    }
}


class Employee 
{
    int empId;
    String name;
    double salary;

    Employee(int empId, String name) 
	{
        this.empId = empId;
        this.name = name;
    }

 
    void setSalary(double salary) throws InvalidSalaryException 
	{
        if (salary < 0) 
		{
            throw new InvalidSalaryException("NAGATIV MA NA DE SALARY BHAI");
        } 
		else
			{
            this.salary = salary;
        }
    }


    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Main Class
public class EmployeeDemo {
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name);

        try 
		{
            emp.setSalary(salary);
            System.out.println("\nEmployee Details:");
            emp.display();
        }
		catch (InvalidSalaryException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
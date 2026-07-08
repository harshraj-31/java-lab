import java.util.*;

class Employee
{
    static void display(int empno)
    {

        System.out.println("Empno :"+empno);
        System.out.println("_________________");
    }

    static void display(int empno, String empname)
    {
        System.out.println("Empno :"+empno);
        System.out.println("Emp Name :"+empname);
        System.out.println("_________________");
    }

    static void display(int empno, String empname, int empsal)
    {
        System.out.println("Empno :"+empno);
        System.out.println("Emp Name:"+empname);
        System.out.println("Emp Salary :"+empsal);
        System.out.println("_________________");
    }

    public static void main(String[] args) 
    {
        Employee eobj = new Employee();
        Scanner sc = new Scanner(System.in); 
    
        System.out.println("Enter the Employee no: ");
        int eno = sc.nextInt();   
    
        System.out.println("Enter the Employee name: ");
        String ename = sc.next();   

        System.out.println("Enter the Employee Salary: ");
        int esal = sc.nextInt();   
        
        eobj.display(eno);
        eobj.display(eno,ename);
        eobj.display(eno,ename,esal);
    }
}

import java.util.*;

class EMP_DETAILS
{
    void display(int empno)
    {
        System.out.println("\n"+"EMP NO IS" + empno+"\n");
    }

    
    void display(int empno, String empname)
    {
        System.out.println("EMP NO IS" + empno);
        System.out.println("EMP NAME IS" + empname+"\n");
    }

    void display(int empno, String empname, double salary)
    {
        System.out.println("EMP NO IS " + empno);
        System.out.println("EMP NAME IS " + empname);
        System.out.println("EMP SALARY IS " + salary);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        EMP_DETAILS eobj = new EMP_DETAILS();

        System.out.println("ENTER EMP NO:");
        int empno = sc.nextInt();

        System.out.println("ENTER EMP NAME:");
        String ename = sc.next();

        System.out.println("ENTER EMP SALARY:");
        double sal = sc.nextDouble();

        eobj.display(empno);                 // calls 1st method
        eobj.display(empno, ename);          // calls 2nd method
        eobj.display(empno, ename, sal);     // calls 3rd method
    }
}

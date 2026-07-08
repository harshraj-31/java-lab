import java.util.*;

class MATH_OPRATIONS
{
    int cal(int a, int b)
    {
        return a + b;
    }
    int cal(int a, int b, int c)
    {
        return a + b + c;
    }
    double cal(double a, double b)
    {
        return a + b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        MATH_OPERATIONS obj = new MATH_OPERATIONS();

        System.out.println("ENTER TWO INTEGER VALUES:");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("SUM = " + obj.cal(a1, a2));

        System.out.println("\nENTER TWO DOUBLE VALUES:");
        double b1 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println("SUM = " + obj.cal(b1, b2));

        System.out.println("\nENTER THREE INTEGER VALUES:");
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        System.out.println("SUM = " + obj.cal(c1, c2, c3));
    }
}

import java.util.*;

class MAX_NUMBER_2
{
    public static void main(String[] args) 
	{

        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();
        if (a > b && a > c) 
{
            System.out.println("Maximum number is: " + a);
        }
        else if (b > c && b>a) {
            System.out.println("Maximum number is: " + b);
        }
        else {
            System.out.println("Maximum number is: " + c);
        }

//        sc.close();
    }
}

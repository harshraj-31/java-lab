import java.util.*;

class SUMOFARRAY
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("ENTER THE SIZE OF ARRAY");
            int size = sc.nextInt();

            int x[] = new int[size];

            for(int i = 0; i < size; i++)
            {
                System.out.println("ENTER THE VALUE OF ARRAY");
                x[i] = sc.nextInt();
            }

            int sum = 0;

            for(int i = 0; i < size; i++)
            {
                System.out.println("Index " + i + " => " + x[i]);
                sum = sum + x[i];
            }

            System.out.println("SUM IS " + sum);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("PLEASE INPUT VALID ELEMENTS " + e);
        }

        catch(NegativeArraySizeException e)
        {
            System.out.println("ARRAY SIZE CAN'T BE NEGATIVE " + e);
        }

        catch(ArithmeticException e)
        {
            System.out.println("CAN'T DIVIDE BY ZERO");
        }

        catch(Exception e)
        {
            System.out.println("sachi value nakh  " + e);
        }

        sc.close();
    }
}

import java.util.Scanner;

class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = 0;
        int sum = 0;

        // count digits
        int temp = n;
        while (temp > 0)
        {
            digits++;
            temp /= 10;
        }

        // Armstrong logic
        temp = n;
        while (temp > 0)
        {
            int rem = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++)
            {
                power = power * rem;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    }
}

import java.util.Scanner;

class ARMSTRONGNUMBER3_1

{
    public static void main(String args[])
    {
        int num, originalNum, remainder;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        originalNum = num;
        while (num != 0)
        {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }
        if (result == originalNum)
        {
            System.out.println(originalNum + "THIS NUMBER IS ARMSTRONG");
        }
        else
        {
               System.out.println(originalNum + "THIS NUMBER IS NOT ARMSTRONG");
        }
        sc.close();
    }
}

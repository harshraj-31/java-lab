
import java.util.Scanner;

class Reverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int a = sc.nextInt();   // number to reverse
        int rem = 0;              // stores last digit
        int rev = 0;

        while (a > 0) // loop runs while num is not 0
        {
            rem = a % 10;        // get last digit
            rev = rev * 10 + rem; // add digit to reverse
            a = a / 10;       // remove last digit
        }
        System.out.println(rev);
    }
}

// DRY RUN:
// while (num > 0)   // loop runs while num is not 0
// {
//     rem = num % 10;        // 1234 % 10 = 4 → rem = 4
//     rev = rev * 10 + rem; // 0*10 + 4 = 4 → rev = 4
//     num = num / 10;       // 1234 / 10 = 123 → num = 123
//     rem = num % 10;        // 123 % 10 = 3 → rem = 3
//     rev = rev * 10 + rem; // 4*10 + 3 = 43 → rev = 43
//     num = num / 10;       // 123 / 10 = 12 → num = 12
//     rem = num % 10;        // 12 % 10 = 2 → rem = 2
//     rev = rev * 10 + rem; // 43*10 + 2 = 432 → rev = 432
//     num = num / 10;       // 12 / 10 = 1 → num = 1
//     rem = num % 10;        // 1 % 10 = 1 → rem = 1
//     rev = rev * 10 + rem; // 432*10 + 1 = 4321 → rev = 4321
        //     num = num / 10;       // 1 / 10 = 0 → loop ends

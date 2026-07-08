
import java.util.Scanner;

class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int num1, num2;
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();

        // System.out.println("DO you want to continue (Y/N)");
        // char cont = (sc.next()).charAt(0);
        switch (ch) {
            case 1:
                System.out.println("Enter the first num: ");
                num1 = sc.nextInt();
                System.out.println("Enter the Second num: ");
                num2 = sc.nextInt();
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println("Enter the first num: ");
                num1 = sc.nextInt();
                System.out.println("Enter the Second num: ");
                num2 = sc.nextInt();
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println("Enter the first num: ");
                num1 = sc.nextInt();
                System.out.println("Enter the Second num: ");
                num2 = sc.nextInt();
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println("Enter the first num: ");
                num1 = sc.nextInt();
                System.out.println("Enter the Second num: ");
                num2 = sc.nextInt();
                System.out.println(num1/num2);
                break;
        }

    }
}

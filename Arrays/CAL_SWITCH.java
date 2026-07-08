import java.util.Scanner;

class CAL_SWITCH
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;

        System.out.println("\n\t1. ADDITION");
        System.out.println("\n\t2. SUBTRACTION");
        System.out.println("\n\t3. MULTIPLICATION");
        System.out.println("\n\t4. EXIT");
        System.out.print("\n\tENTER YOUR CHOICE => ");
		choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.print("ENTER NUMBER 1: ");
                a = sc.nextInt();
                System.out.print("ENTER NUMBER 2: ");
                b = sc.nextInt();
                System.out.println("RESULT IS = >" + (a + b));
                break;

            case 2:
                System.out.print("ENTER NUMBER 1: ");
                a = sc.nextInt();
                System.out.print("ENTER NUMBER 2: ");
                b = sc.nextInt();
                System.out.println("RESULT IS = > " + (a - b));
                break;

            case 3:
                System.out.print("ENTER NUMBER 1: ");
                a = sc.nextInt();
                System.out.print("ENTER NUMBER 2: ");
                b = sc.nextInt();
                System.out.println("RESULT IS = > " + (a * b));
                break;

            case 4:
                System.out.println("Exiting program...");
                System.exit(0);

            default:
                System.out.println("ENTER THE CHOICE");
        }

        sc.close();
    }
}

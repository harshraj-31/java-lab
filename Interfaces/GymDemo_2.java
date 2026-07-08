import java.util.Scanner;

// Custom Exception
class InvalidMembershipException extends Exception 
{
    public InvalidMembershipException(String message) 
    { 
        super(message);
    }
}

// Interface Rules that  must be followed”
interface MembershipService
{
    void register(int months, double fee) throws InvalidMembershipException;
    void renew(int months) throws InvalidMembershipException;
}

// Base Class
class Person 
{

    private int memberId;
    protected String name;
    public String gymName = "FitZone Gym";

    public Person(int memberId, String name) 
    {
        this.memberId = memberId;
        this.name = name;
    }

    public void displayPerson() 
    {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Gym Name: " + gymName);
    }

}

// Derived Class
class Member extends Person implements MembershipService 
{

    private int membershipMonths;
    private double totalFee;

    public Member(int memberId, String name) 
    {
        super(memberId, name);
    }
    
    public void register(int months, double fee) throws InvalidMembershipException 
    {
        if (months <= 0 || fee <= 0) 
        {
            throw new InvalidMembershipException("Invalid membership duration or fee!");
        }
        membershipMonths = months;
        totalFee = fee;
        System.out.println("Membership Registered Successfully!");
    }

    public void renew(int months) throws InvalidMembershipException 
    {
        if (months <= 0) 
        {
            throw new InvalidMembershipException("Invalid renewal duration!");
        }

        membershipMonths += months;
        System.out.println("Membership Renewed Successfully!");
    }

    public void display() 
    {
        displayPerson();
        System.out.println("Membership Months: " + membershipMonths);
        System.out.println("Total Fee: " + totalFee);
    }

}

// Main Class
public class GymDemo 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clears leftOverLine

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Member member = new Member(id, name);

        int choice;
        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Register Membership");
            System.out.println("2. Renew Membership");
            System.out.println("3. Display Member Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try 
            {

                switch(choice) 
                {

                    case 1:
                        System.out.print("Enter months: ");
                        int months = sc.nextInt();
                        System.out.print("Enter fee: ");
                        double fee = sc.nextDouble();
                        member.register(months, fee);
                        break;

                    case 2:
                        System.out.print("Enter renewal months: ");
                        int renewMonths = sc.nextInt();
                        member.renew(renewMonths);
                        break;

                    case 3:
                        member.display();
                        break;

                    case 4:
                        System.out.println("Thank you! Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } 
            catch (InvalidMembershipException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
            
        }while (choice != 4);

        sc.close();
    }
}
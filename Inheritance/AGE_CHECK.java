import java.util.Scanner;

class InvalidAgeException extends Exception 
{
    public InvalidAgeException(String message) 
	{
        super(message);
    }
}


class Voter 
{
    String name;
    int age;

    Voter(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    void checkEligibility() throws InvalidAgeException 
	{	
        if (age < 18) 
		{
            throw new InvalidAgeException("ARE YAAR TU NANO CHEE AAJI");
        } 
		else 
		{
            System.out.println("TU DY SAKIS VOTE");
        }
    }
}

// Main Class
public class AGE_CHECK 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Voter v = new Voter(name, age);

        try 
		{
            v.checkEligibility();
        }
		catch (InvalidAgeException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
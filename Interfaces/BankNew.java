import java.util.Scanner;

// Custom Exception
class InvalidTransactionException extends Exception 
{
    InvalidTransactionException(String msg) 
    {
        super(msg);
    }
}

// Interface (class implements interface)
interface BankOperations
{
    void deposit(double amount) throws InvalidTransactionException;

    void withdraw(double amount) throws InvalidTransactionException;
}

// Parent Class
class Account 
{
    int accNo;
    double balance;

    Account(int accNo, double balance) 
    {
        this.accNo = accNo;
        this.balance = balance;
    }

    void displayAccount() 
    {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

}

// Child Class
class SavingsAccount extends Account implements BankOperations 
{

    double interestRate = 5;
    SavingsAccount(int accNo, double balance) 
    {
        super(accNo, balance);
    }

    public void deposit (double amount) throws InvalidTransactionException 
    {
        if (amount < 0)
        {
            throw new InvalidTransactionException("Deposit amount cannot be negative");
        }

        balance += amount;
        System.out.println("Deposit Successful");   
    }

    public void withdraw(double amount) throws InvalidTransactionException 
    {
        if(amount < 0 || amount > balance)
        {
            throw new InvalidTransactionException("Invalid Withdraw Amount");
        }

        balance -= amount;
        System.out.println("Withdraw Successful");
    }

    void addInterest() 
    {
        double interest = balance * interestRate / 100; 
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }

    // Method Overriding
    @Override
    void displayAccount() 
    {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main Class
public class BankNew 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(accNo, balance);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try
            {
                switch (choice) 
                {

                    case 1:
                        System.out.print("Enter deposit amount: ");
                        acc.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        acc.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        acc.addInterest();
                        break;

                    case 4:
                        acc.displayAccount();
                        break;

                    case 5:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            }catch (InvalidTransactionException e) 
            {
                System.out.println("Error: " + e.getMessage());
            }
        }while (choice != 5);
    }
}
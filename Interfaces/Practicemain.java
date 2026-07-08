import java.util.*;

class InvalidTransactionException extends Exception
{
    InvalidTransactionException(String msg)
    {
        super(msg);
    }   
}

//Interface (cant create object)->Methods must be implemented
interface BankOps
{
    void deposit(double amount) throws InvalidTransactionException;

    void withdraw(double amount) throws InvalidTransactionException;
}

//parent class
class Account
{
    int accNo;
    double balance;

    Account(int accno, double balance)
    {
        this.accNo = accno;
        this.balance = balance;
    }
    void displayAcc()
    {
        System.out.println("Account Number: "+accNo);
        System.out.println("Balance: "+balance);
    }

}
// child class
class SavingsAcc extends Account implements BankOps
{
    double ir=5;

    SavingsAcc(int accNo, double balance) 
    {
        super(accNo,balance);
    }

    public void deposit(double amount) throws InvalidTransactionException
    {
        if(amount <= 0)
        {
            throw new InvalidTransactionException("Invalid Deposit Amount!, try again");

        }
        balance+=amount;
        System.out.println(amount+" Deposited !");
    }

    public void withdraw(double amount) throws InvalidTransactionException
    {
        if(amount < 0 || amount > balance)
        {
            throw new InvalidTransactionException("Invalid withdraw amount!, Try again");
        }
        balance-=amount;
        System.out.println(amount+" Withrawn");

    }
    void addInterest() 
    {
        double interest = balance * ir / 100; 
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }

    @Override
    void displayAcc()
    {
        System.out.println("Account Number: "+accNo);
        System.out.println("Account Balance: "+balance);
        System.out.println("Interest Rate : "+ir);
    }
}

public class Practicemain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int ano = sc.nextInt();

        System.out.println("Enter Initial Balance: : ");
        double bal = sc.nextDouble();

        SavingsAcc acc = new SavingsAcc(ano,bal);

        int choice;
        do
        {
            System.out.println("--Menu--");
            System.out.println("1. Deposit: ");
            System.out.println("2. Withdraw: ");
            System.out.println("3. Add Interest:  ");
            System.out.println("4. Display Account:");
            System.out.println("0.Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            try
            {
                switch(choice) 
                {
                    case 1:
                        System.out.println("Enter Deposit Amount: ");
                        double damt = sc.nextDouble();
                        acc.deposit(damt);
                        break;

                    case 2:
                        System.out.println("Enter Withdraw Amount: ");
                        double wamt = sc.nextDouble();
                        acc.withdraw(wamt);
                        break;
                    

                    case 3:
                        acc.addInterest();
                        break;

                    case 4:
                        acc.displayAcc();
                        break;

                    case 0:
                        System.out.println("Exitingg..");
                        break;

                    default:
                        System.out.println("Invalid choice..");
                }
            }catch(InvalidTransactionException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        
        }while(choice!=0);
        
    }
}




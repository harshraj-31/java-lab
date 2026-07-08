abstract class Bank
{
    int accountNumber;
    String accountHolderName;
    double balance;
    final String bankName = "ABC Bank";

    Bank(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    final void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    final void withdraw(double amount)
    {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    abstract double calculateInterest();

    void display()
    {
		System.out.println("============================================");
        System.out.println("Bank Name   : " + bankName);
        System.out.println("Account No  : " + accountNumber);
        System.out.println("Holder Name : " + accountHolderName);
        System.out.println("Balance     : " + balance);
		System.out.println("============================================");
    }
}

// ================= SAVINGS ACCOUNT =================
class SavingsAccount extends Bank
{
    double interestRate = 5;

    SavingsAccount()
    {
        super(101, "John", 10000);
    }

    double calculateInterest()
    {
        return balance * interestRate / 100;
    }
}

// ================= CURRENT ACCOUNT =================
class CurrentAccount extends Bank
{
    double overdraftLimit = 20000;

    CurrentAccount()
    {
        super(201, "Smith", 15000);
    }

    double calculateInterest()
    {
        return 0;
    }
}

// ================= MAIN CLASS =================
public class BankInheritanceProgram
{
    public static void main(String[] args)
    {
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(5000);
        sa.display();
        System.out.println("Interest: " + sa.calculateInterest());

        CurrentAccount ca = new CurrentAccount();
        ca.withdraw(3000);
        ca.display();
        System.out.println("Interest: " + ca.calculateInterest());
    }
}
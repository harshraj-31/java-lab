import java.util.*;

class Bank
{
    int AccNo;
    String AccHolderName;
    double Balance;

    Bank() // Default constructor 
    {

    }

    Bank(int AccNo, String AccHolderName,double Balance)
    {
        this.AccNo = AccNo;
        this.AccHolderName = AccHolderName;
        this.Balance = Balance;
    }

    void displayDetails()
    {
        System.out.println("__________________________________________");
        System.out.println("\tAccount Number: "+AccNo);
        System.out.println("\tAccount holder Name: "+AccHolderName);
        System.out.println("\tCurrent Balance: "+Balance+"\n");
    }
    void withdraw(double amount)
    {
        Balance = Balance - amount;
        System.out.println("__________________________________________");
        System.out.println("Your Amount is Withdrawn");
        System.out.println("Updated Balance: "+Balance+"\n");
    }

    void deposit(double amount)
    {
        Balance = Balance + amount;
        System.out.println("__________________________________________");
        System.out.println("Amount Deposited!");
        System.out.println("Updated Balance: "+Balance+"\n");
    }
}

class BankDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Account no: ");
        int accno = sc.nextInt();
    
        System.out.println("Enter the Account Holder Name: ");
        String accholname = sc1.nextLine();

        System.out.println("Enter the Account Balance: ");
        double bal = sc.nextDouble();

    // Default 
    //    Bank b1 = new Bank();
    //  b1.displayDetails(); 

    //parameterized 
    Bank b2 = new Bank(accno,accholname,bal);
    

    // Menu for withdraw and deposit
    while(true)
    {
        System.out.println("1.Withraw ");
        System.err.println("2.Deposit ");
        System.out.println("3.Display all the account details");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the amount to withdraw : ");
                double widamt = sc.nextDouble();
                if(widamt <=0)
                {
                    System.out.println("Amount must be greater than 0!");
                }
                else if( widamt > bal)
                {
                    System.out.println("Amount is greater than balance, enter a valid amount!");
                }
                else if(bal <=0)
                {
                    System.out.println("Insufficient Balance!");        
                }
                else
                {
                    b2.withdraw(widamt);
                }
                break;
            case 2:
                System.out.println("Enter the amount to withdraw : ");
                double depamt = sc.nextDouble();
                if(depamt <=0)
                {
                    System.out.println("Amount must be greater than 0!");
                } 
                else
                {
                    b2.deposit(depamt);
                }      
                break;

            case 3:     
                b2.displayDetails();
                break;

            case 4:
                System.out.println("Exiting...");
                return;

            default:
                System.out.println("Invalid choice, try again");
                
        }
    }
    }
}
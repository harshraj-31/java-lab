// BANK CLASS
abstract class bank
{
 double ano,balance;
 String ahname;
 final String bankname="ljmca";
	
 bank(double ano,String ahname,double balance)
	{
	this.ano=ano;
	this.ahname=ahname;
	this.balance=balance;
	}
	public void deposite()
	{
		
	}
	
	public void withdraw()
	{
		
	}
	
}

// SAVING ACCOUNT CLASS
class SavingsAccount abstract bank
{
	 double irate = 0.8;
	 
	 SavingsAccount(double ano,String ahname,double balance)
	 super(ano,ahname,balance);
	 this.irate=irate;
	 
	 public void calculateInterset()
    {
		balance=balance+irate/100;
	}
}
// CURRENT ACOUNT CLASS
class CurrentAccount abstract bank
{
	
}

// main class
class Main_bank   
{
	public static void main(String args[])
	{
	
	}
}
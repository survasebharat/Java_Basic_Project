package abstraction;

import java.util.Scanner;

interface Bank
{
	public abstract void deposite(double amount);
	public abstract void withdrow(double amount);
}
class Customer implements Bank
{

	private double balance = 10000;
	@Override
	public void deposite(double amount) 
	{
		if(amount<=0)
		{
			System.err.println("Amount con't be less then Zero");
		}
		else 
		{
			this.balance = this.balance + amount;
			System.out.println("Dear Customer Your Balance ="+this.balance);
		}
		
	}

	@Override
	public void withdrow(double amount)
	{
		if(amount > this.balance)
		{
			System.err.println("Amount con't be deposited");
		}
		else
		{
			this.balance = this.balance + amount;
			System.out.println("your Remaning Balance is ="+this.balance);
			
		}
		
	}
	
}
public class BankAppliacaiton {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Customer cs = new Customer();
		System.out.println("Enter Amount If you Wont to Debite");
		double deposite = sc.nextDouble();
		cs.deposite(deposite);
		
		System.out.println("Enter Amount if you Wont to Creadit");
		double creadite = sc.nextDouble();
		cs.withdrow(creadite);
		
		
	}
}

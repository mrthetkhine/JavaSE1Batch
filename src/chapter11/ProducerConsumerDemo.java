package chapter11;

class Account
{
	int amount ;
	
	synchronized public void widraw(int widrawAmount)
	{
		if( this.amount < widrawAmount)
		{
			try 
			{
				System.out.println("Wait");
				wait();
				
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.amount -= widrawAmount;
		
		System.out.println("After widraw amount "+this.amount);
	}
	synchronized public void deposit(int depositAmount)
	{
		amount += depositAmount;
		notify();
		System.out.println("After Deposit amount "+this.amount);
	}
}
class WidrawThread extends Thread
{
	Account account;
	
	int amount;
	WidrawThread(Account acc)
	{
		this.account = acc;
	
	}
	public void run()
	{
		for(int i=0; i< 5;i++)
		{
			System.out.println("Widraw");
			account.widraw(10);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}
}
class DepositThread extends Thread
{
	Account account;
	
	int amount;
	DepositThread(Account acc)
	{
		this.account = acc;
	
	}
	public void run()
	{
		for(int i=0; i< 5;i++)
		{
			System.out.println("Deposit");
			account.deposit(10);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
		}
		
		
	}
}

public class ProducerConsumerDemo {
	public static void main(String[]args)
	{
		Account account = new Account();
		WidrawThread widraw = new WidrawThread(account);
		DepositThread deposit = new DepositThread(account);
		
		widraw.start();
		deposit.start();
		
		try {
			widraw.join();
			deposit.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total balance Amount "+account.amount);
	}

}

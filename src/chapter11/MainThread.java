package chapter11;

public class MainThread {

	public static void main(String[]args)
	{
		Thread t = Thread.currentThread();
		System.out.println("T name "+t.getName() +" get Id "+t.getId());
		try
		{
			for(int i=0;i < 5; i++)
			{
				System.out.println("I is "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

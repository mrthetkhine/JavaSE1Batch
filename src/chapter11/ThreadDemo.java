package chapter11;

class MyThread implements Runnable
{
	String name;
	
	MyThread(String name)
	{
		this.name = name;
	}

	@Override
	public void run() 
	{
		for(int i=0; i< 5; i++)
		{
			System.out.println("Thread "+name +" i is "+i);
		}
		
	}
	
}
class SecondThread extends Thread
{
	String name;
	
	SecondThread(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int i=0; i< 5; i++)
		{
			System.out.println("Thread "+name +" i is "+i);
		}
	}
}
public class ThreadDemo {
	public static void main(String args[])
	{
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		
		SecondThread sec1 = new SecondThread("Sec1");
		SecondThread sec2 = new SecondThread("Sec2");
		
		sec1.setPriority(Thread.MAX_PRIORITY);
		//sec2.setPriority(Thread.MAX_PRIORITY);
		
		Thread myThread1 = new Thread(t1);
		myThread1.start();
		
		Thread myThread2 = new Thread(t2);
		myThread2.start();
		
		sec1.start();
		sec2.start();
		
		System.out.println("Code run before all four thread terminated");
		try
		{
			
			myThread1.join();
			myThread2.join();
			sec1.join();
			sec2.join();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Code run after all four thread terminated");
		
		
	}
}

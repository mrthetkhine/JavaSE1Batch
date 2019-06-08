package chapter11;

class MyUnsyncThread extends Thread
{
	transient static int data = 0;
	String name ;
	
	MyUnsyncThread(String name)
	{
		this.name = name;
	}
	static void inc()
	{
		MyUnsyncThread.data++;
	}
	static void dec()
	{
		MyUnsyncThread.data --;
	}
	public void run()
	{
		for(int i=0; i< 50;i++)
		{
			inc();
			dec();
			inc();
		}
	}
	
	
}
public class SynchronizedDemo {

	public static void main(String[]args)
	{
		MyUnsyncThread t1 = new MyUnsyncThread("t1");
		MyUnsyncThread t2 = new MyUnsyncThread("t2");
		
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Data is "+MyUnsyncThread.data);
	}
}

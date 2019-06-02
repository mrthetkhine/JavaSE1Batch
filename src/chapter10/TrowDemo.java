package chapter10;

public class TrowDemo {

	static int div(int a, int b)throws Exception
	{
		if( b == 0)
		{
			throw new Exception("Custom Division by zero ");
		}
		else
		{
			return a /b;
		}
	}
	public static void main(String[]args)
	{
		try
		{
			int a = div(10,2);
			System.out.println("Result is "+a);
			
			a = div (10,0);
			System.out.println("Result is "+a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

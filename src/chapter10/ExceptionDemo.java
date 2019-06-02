package chapter10;

public class ExceptionDemo {

	public static void main(String[]args)
	{
		int d= 10;
		
		try
		{
			int a = 42 / d;
			String str = null;
			System.out.println(str.toLowerCase());
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Other exception "+e.getMessage());
		}
		finally
		{
			System.out.println("I run whatever");
		}
		
		System.out.println("Next line after exception");
	}
}

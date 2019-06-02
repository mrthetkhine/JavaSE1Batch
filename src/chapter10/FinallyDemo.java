package chapter10;

public class FinallyDemo {

	static int method()throws Exception
	{
		try 
		{
			return 10/0;
		}
		catch (Exception e)
		{
			throw new Exception("Bla Blah");
			//return 20;
		}
		finally 
		{
			System.out.println("Hey");
			throw new Exception(" Finally Bla Blah");
		}
	}
	public static void main(String args[])throws Exception
	{
		System.out.println(method());
	}
}

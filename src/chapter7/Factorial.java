package chapter7;

public class Factorial {
	static long fact(long n)
	{
		//return n==1? 1 : n * fact(n-1);
		System.out.println("N is "+n);
		if( n == 1)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	public static void main(String[]args)
	{
		System.out.println("Fact is "+fact(50));
	} 
}

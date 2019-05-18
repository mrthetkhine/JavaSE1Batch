package chapter4;

public class BitWiseAndOr {
	
	static boolean getTrue()
	{
		System.out.println("Get True");
		return true;
	}
	static boolean getFalse()
	{
		System.out.println("Get False");
		return false;
	}
	public static void main(String []args)
	{
		boolean result = getTrue() || getFalse() ;
		System.out.println(result);
	}

}

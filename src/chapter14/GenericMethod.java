package chapter14;

public class GenericMethod {
	
	public static <T extends Number>  double power(T t, int power)
	{
		System.out.println(t.getClass().getName());
		return (Math.pow(t.doubleValue(), power));
	}
	public static void main(String[]args)
	{
		System.out.println( power(10,3));
		System.out.println( power(2.0,3));
	}

}

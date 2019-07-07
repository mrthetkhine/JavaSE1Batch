package chapter18;

public class NaNDemo {

	public static void main(String[]args)
	{
		double d = 10/-0.0;
		System.out.println(d);
		System.out.println(Double.isInfinite(d));
		
		double k =  0.0/ 0;
		System.out.println(Double.isNaN(k));
		
		Integer myInt  = Integer.parseInt("1000");
		System.out.println(myInt);
	}
}

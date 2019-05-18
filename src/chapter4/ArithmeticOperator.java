package chapter4;

public class ArithmeticOperator {
	public static void main(String[]args)
	{
		float myFloat = 20;
		int myInt = 3;
		
		float result = myFloat / myInt;
		float reminder = myFloat % 3.0f;
		
		float sum = 10;
		sum += myFloat;
		
		System.out.println(result);
		System.out.println("reminder "+reminder);
		
		result = - myInt;
		System.out.println(result / 1);
		
		System.out.println(sum);
	}
}

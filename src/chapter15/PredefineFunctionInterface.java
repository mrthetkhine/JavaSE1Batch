package chapter15;
import java.util.function.UnaryOperator;

public class PredefineFunctionInterface {
	
	public static void main(String[]args)
	{
		UnaryOperator<Integer> op = (n)->n*n;
		System.out.println(op.apply(12));
	}
}

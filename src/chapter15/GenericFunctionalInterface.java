package chapter15;

interface GenFunc<T>
{
	T func(T t);
}
public class GenericFunctionalInterface {
	public static void main(String args[])
	{
		GenFunc<Double> gen = (n)->n*n;
		System.out.println(gen.func(10.0));
		
		GenFunc<Integer> genInt = (n)->n*2;
		System.out.println(genInt.func(100));
		
	}
}

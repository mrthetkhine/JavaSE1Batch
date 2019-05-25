package chapter7;

public class VarArgs {
	static void demo(int ... args)
	{
		System.out.println("Length of args "+args.length);
		for(int i : args)
		{
			System.out.println(" i is"+i);
		}
		
	}
	public static void main(String ... args)
	{
		demo();
		demo(1);
		demo(1,2,3,4,5,5);
	}
}

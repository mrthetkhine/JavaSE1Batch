package chapter15;

interface MyCapFunc
{
	int func(int n);
}
public class CaptureVariable {
	static void externalMethod()
	{
		System.out.println("External method");
	}
	public static void main(String[]args)
	{
		final int num = 20;
		MyCapFunc capFun = (n)->{
			externalMethod();
			System.out.println("Inside lambda "+ num);
			//num ++;
			return n* num;
		};
		System.out.println(capFun.func(10));
		//num = 100;
	}
}

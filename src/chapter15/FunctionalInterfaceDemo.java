package chapter15;

interface MyFunc{
	int func(int a);
}
public class FunctionalInterfaceDemo {

	static int customeFunc(int a)
	{
		System.out.println("Custom function "+a);
		return a;
	}
	int instanceMethod(int a)
	{
		System.out.println("Instance function "+a);
		return a;
	}
	public static void main(String args[])
	{
		MyFunc myFunc = (n)->{
			System.out.println("Lambda with block executed");
			return n*n;
		};
		System.out.println(myFunc.func(10));
		
		myFunc = (n)-> (int)(Math.random()*n);
		System.out.println(myFunc.func(10));
		
		myFunc = FunctionalInterfaceDemo::customeFunc;
		myFunc.func(41);
		
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		myFunc = obj::instanceMethod;
		
		myFunc.func(1200);
	}
}

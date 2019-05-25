package chapter7;

public class StaticDemo {

	static int staticData ;
	int instanceData;
	
	static{
		System.out.println("Run static initializer");
		staticData = 300;
	}
	StaticDemo()
	{
		System.out.println("Constrctor called");
	}
	
	static void method()
	{
		staticData = 200;
		System.out.println("Run method");
	}
	
	public static void main(String[]args)
	{
		StaticDemo obj1;
		
		
		obj1 = new StaticDemo();
		//StaticDemo.staticData = 100;
		obj1.instanceData = 300;
		
		StaticDemo obj2  = new StaticDemo();
		obj2.instanceData = 200;
		
		
		
		System.out.println("Obj1 static "+ obj1.staticData);
		System.out.println("Obj1 instance "+ obj1.instanceData);
		System.out.println("Obj2 static "+ obj2.staticData);
		System.out.println("Ob2 instance "+ obj2.instanceData);
		
		StaticDemo obj3 = null;
		obj3.method();
		
		final double PI = Math.PI;
		
		
	}
}

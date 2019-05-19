package chapter7;

public class MyClass {
	
	int data;
	
	MyClass(int data)
	{
		this.data = data;
	}
	
	static void method(int a)
	{
		a ++;
	}
	static void passReference(MyClass a)
	{
		a.data ++;
	}
	static void changeReference(MyClass a)
	{
		a = new MyClass(400);
	}
	public static void main(String args[])
	{
		MyClass c = new MyClass(300);
		int  mainA = 200;
		
		c.method(mainA);
		System.out.println("Main A "+ mainA);
		
		passReference(c);
		System.out.println("c data "+ c.data);
		
		changeReference(c);
		System.out.println("c data "+ c.data);
		
	}

}

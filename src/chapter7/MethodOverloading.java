package chapter7;

public class MethodOverloading {
	
	void print(String s)
	{
		System.out.println("String print "+s);
	}
	void print(int i)
	{
		System.out.println("Int print "+i);
	}
	void print(long l)
	{
		System.out.println("long print "+l);
	}
	void print(double d)
	{
		System.out.println("Double print "+d);
	}
	public static void main(String args[])
	{
		MethodOverloading m = new MethodOverloading();
		long l = 20;
		m.print(12);
		m.print("Hello");
		m.print(12.2);
		m.print(12.0f);
		m.print(l);
		
	} 
}

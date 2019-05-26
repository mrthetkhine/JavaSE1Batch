package chapter8;

class SuperClass
{
	int i;
	SuperClass()
	{
		System.out.println("Superclass Constructor");
	}
	void method()
	{
		System.out.println("Super method");
	}
	void superMethod()
	{
		System.out.println("Super method");
	}
	void display()
	{
		System.out.println("Super class diplay "+i);
	}
}
class SubClass extends SuperClass
{
	int i;
	SubClass()
	{
		//super();
		System.out.println("Subclass Constructor");
	}
	SubClass(int a)
	{
		System.out.println("Subclass Constructor with para");
	}
	void method()
	{
		i = 10;
		System.out.println("Subclass method");
		
	}
	void display()
	{
		System.out.println("Subclass display "+i);
	}
}
public class SuperSubClass {
	public static void main(String[]args)
	{
		SuperClass obj = new SubClass(1);
		obj.i = 300;
		obj.display();
	}

}

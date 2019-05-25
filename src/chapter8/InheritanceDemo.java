package chapter8;

class Parent
{
	protected int i,j;
	
	public void methodOfA()
	{
		System.out.println("Method of A");
	}
}
class Child extends Parent
{
	int k;
	
	public void methodOfChild()
	{
		System.out.println("Child method");
	}
}

public class InheritanceDemo {

	public static void main(String[]args)
	{
		Child child = new Child();
		child.methodOfChild();
		child.methodOfA();
		child.i = 10;
	}
}

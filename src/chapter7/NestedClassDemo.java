package chapter7;

public class NestedClassDemo {
	int outer_x = 100;
	
	void test()
	{
		Inner inner = new Inner();
		inner.display();
	}
	class Inner
	{
		void display()
		{
			System.out.println("Inner display "+ outer_x);
		}
	}
	
	public static void main(String[]args)
	{
		NestedClassDemo demo = new NestedClassDemo();
		demo.test();
		demo.outer_x = 300;
		demo.test();
	}
}

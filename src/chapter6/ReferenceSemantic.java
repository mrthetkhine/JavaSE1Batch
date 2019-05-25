package chapter6;

public class ReferenceSemantic {
	public static void main(String[]args)
	{
		MyInteger a = new MyInteger(20);
		MyInteger b = new MyInteger(30);
		
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
		a = b;
		//a.value = 100;
		
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
		
	}

}

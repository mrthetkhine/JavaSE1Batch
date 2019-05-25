package chapter6;

public class MyInteger {
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	public MyInteger()
	{
		this.value = 0;
	}
	
	public MyInteger add(MyInteger b)
	{
		int sum = this.value + b.value;
		return new MyInteger(sum);
	}
	public MyInteger subtract(MyInteger b)
	{
		int diff = this.value - b.value;
		return new MyInteger(diff);
	}
	public MyInteger div(MyInteger b)
	{
		int division = this.value  /b.value;
		return new MyInteger(division);
	}
	public MyInteger mult(MyInteger b)
	{
		int multiplication = this.value * b.value;
		return new MyInteger(multiplication);
	}
	public MyInteger inc()
	{
		this.value ++;
		return this;
	}
	public String toString()
	{
		//System.out.println("To String called");
		return this.value+"";
	}
	public static void main(String[]args)
	{
		MyInteger a = new MyInteger(10);
		MyInteger b = new MyInteger(20);
		
		MyInteger sum = a.add(b);
		MyInteger division = a.div(b);
		
		System.out.println("Sum is "+sum);
		System.out.println("Division is "+division);
		
		a.inc();
		System.out.println("A inc is "+a);
	
		
		
	}
	
}

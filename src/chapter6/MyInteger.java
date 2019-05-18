package chapter6;

public class MyInteger {
	int value;
	
	MyInteger(int value)
	{
		this.value = value;
	}
	
	MyInteger add(MyInteger b)
	{
		int sum = this.value + b.value;
		return new MyInteger(sum);
	}
	MyInteger subtract(MyInteger b)
	{
		int diff = this.value - b.value;
		return new MyInteger(diff);
	}
	MyInteger div(MyInteger b)
	{
		int division = this.value  /b.value;
		return new MyInteger(division);
	}
	MyInteger mult(MyInteger b)
	{
		int multiplication = this.value * b.value;
		return new MyInteger(multiplication);
	}
	MyInteger inc()
	{
		this.value ++;
		return this;
	}
	public String toString()
	{
		System.out.println("To String called");
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

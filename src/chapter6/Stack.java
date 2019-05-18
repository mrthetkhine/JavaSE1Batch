package chapter6;

public class Stack {
	String[] values ;
	int top = -1;
	
	Stack(int size)
	{
		this.values = new String[size];
	}
	void push(String element)
	{
		
		if( top < values.length -1 )
		{
			top ++;
			this.values[ top ] = element;
		}
		else
		{
			System.out.println("Cannot push element "+element +" stack reach end");
		}
		
	}
	String pop()
	{
		if( top >= 0)
		{
			return this.values[top--];
		}
		else
		{
			System.out.println("Cannot pop reach end of stack");
			return null;
		}
	}
	int getStackSize()
	{
		//System.out.println("Top is ");
		return top+1;
	}
	public static void main(String[]args)
	{
		Stack myStack = new Stack(5);
		myStack.push("One");
		myStack.push("Two");
		myStack.push("Three");
		myStack.push("Four");
		myStack.push("Five");
		myStack.push("Six");
		
		System.out.println("Stack size "+ myStack.getStackSize());
		int stackSize = myStack.getStackSize();
		for(int i=0; i < stackSize ; i++)
		{
			System.out.println(myStack.pop());
		}
	}

}

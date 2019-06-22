package chapter14;

class GenericStack<T>
{
	T[] elements;
	int top = -1;
	
	GenericStack()
	{
		this.elements =(T[]) new Object[10];
	}
	public void push(T ele)
	{
		this.elements[++top] = ele;
	}
	public T pop()
	{
		return this.elements[top--];
	}
}
public class GenericStackDemo {
	public static void main(String[]args)
	{
		GenericStack<String> strStack = new GenericStack<String>();
		strStack.push("One");
		strStack.push("Two");
		strStack.push("Three");
		
		System.out.println(strStack.pop());
		System.out.println(strStack.pop());
		System.out.println(strStack.pop());
		
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(10);
		intStack.push(20);
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		System.out.println(intStack instanceof GenericStack<?> );
	}
}

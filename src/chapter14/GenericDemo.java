package chapter14;

class Generic<T>
{
	T obj;
	Generic(T obj)
	{
		this.obj = obj; 
	}
	T getObj()
	{
		return this.obj;
	}
	void showType()
	{
		System.out.println("Type of t is "+this.obj.getClass().getName());
	}
}
public class GenericDemo {
	public static void main(String[]args)
	{
		Generic<String> genericString = new Generic<String>("Hello");
		String obj1 = genericString.getObj();
		genericString.showType();
		
		Generic<Integer> genericInteger = new Generic<Integer>(21);
		Integer obj2 = genericInteger.getObj();
		genericInteger.showType();
	}

}

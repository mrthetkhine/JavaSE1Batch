package chapter14;

class Bounded<T extends Number>
{
	T element;
	Bounded(T t)
	{
		this.element= t;
	}
	public Number add(T b)
	{
		return (Number) (element.doubleValue()+ b.doubleValue());
	}
}
public class BoundedTypeDemo {
	public static void main(String[]args)
	{
		Bounded<Integer> iBound = new Bounded<Integer>(2);
		Number sum = iBound.add(20);
		System.out.println(sum);
		
	
	}

}

package chapter9;

interface DefaultInterface
{
	//void method();
	
	public default void method()
	{
		System.out.println("Default method");
	}
}
class Impl implements DefaultInterface
{

}
public class DefaultImplmenetation {
	public static void main(String[]args)
	{
		DefaultInterface def = new Impl();
		def.method();
	}
}

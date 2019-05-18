
public class StringDemo {
	
	public static void main(String[]args)
	{
		String str = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		System.out.println(str.length());
		
		System.out.println( str.equals( str2));
		System.out.println( str.equals(str3));
	}
}

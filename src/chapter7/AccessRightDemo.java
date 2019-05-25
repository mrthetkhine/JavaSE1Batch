package chapter7;
import java.lang.reflect.Field;

import chapter6.*;
public class AccessRightDemo {

	public static void main(String[]args) throws ClassNotFoundException
	{
		MyInteger myInteger = new MyInteger(10);
		
		myInteger.inc();
		
		System.out.println(myInteger);
		
		Class myIntegerClass = Class.forName("chapter6.MyInteger");
		try {
			Object obj = myIntegerClass.newInstance();
			Field field = myIntegerClass.getDeclaredField("value");
			field.setAccessible(true);
			
			field.set(obj, 200);
			System.out.println(obj);
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}

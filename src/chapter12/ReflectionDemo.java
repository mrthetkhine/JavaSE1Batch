package chapter12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class ReflectionDemo {
	
	public void show()
	{
		System.out.println("Show Method");
	}
	public void validate()
	{
		System.out.println("Validate method in Reflection ");
	}
	static void invokeMethod(Object o,String name)
	{
		Method validateMethod;
		try {
			validateMethod = o.getClass().getMethod(name, null);
			validateMethod.invoke(o, null);
			
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	public static void printClass(Object obj)
	{
		System.out.println(obj.getClass().toGenericString());
		
		Method methods[] = obj.getClass().getMethods();
		for(Method m : methods)
		{
			//System.out.println("Method "+m.getName());
		}
	}
	public static void main(String args[])
	{
		Date d = new Date();
		printClass(d);
		
		ReflectionDemo demo = new ReflectionDemo();
		invokeMethod(demo,"show");
	}
}

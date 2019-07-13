package chapter19;

import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[]args)
	{
		Properties prop = new Properties();
		prop.put("name", "UserName");
		prop.put("age", 21);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("age"));
	}
}

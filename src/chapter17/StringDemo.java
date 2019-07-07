package chapter17;

import java.util.Date;

public class StringDemo {
	public static void main(String[]args)
	{
		long start = (new Date()).getTime();
		String str = "";
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i < 5000; i++)
		{
			//str+= "Hello";
			buffer.append("Hello");
		}
		long end = (new Date()).getTime();
		
		long runningTime = end -start;
		System.out.println("Running time "+runningTime);
		
		System.out.println("Hello".charAt(3));
		String str2 = null;
		//"Hello".equals(anObject)
		System.out.println("Compare A B "+"A".compareTo("B"));
		
		String howAreYou = "How are you are";
		System.out.println("Index of "+howAreYou.lastIndexOf("are1"));
		
		System.out.println("Happy new year".substring(3,7));
		
		String newString = howAreYou.replace("you", "me");
		System.out.println(howAreYou);
		System.out.println(newString);
		
		String joinResult = String.join(";", "Apple","Google","Microsoft");
		System.out.println(joinResult);
		
		
	}

}

package chapter19;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[]args)
	{
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("One");
		
		System.out.println("HashSet Contains one "+ hashSet.contains("One"));
		
		
		for(String s : hashSet)
		{
			System.out.println(s);
		}
	}
}

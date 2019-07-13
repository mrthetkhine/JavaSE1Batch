package chapter19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class MapDemo {
	static int iteration = 100000;
	
	private static void linkedListTest() {
		long start = System.currentTimeMillis();
		LinkedList<String> names = new LinkedList<String>();
		
		for(int i=0;i < iteration;i ++)
		{
			names.add("User"+i);	
		}
		long end = System.currentTimeMillis();
		System.out.println("Index of "+names.indexOf("User"+1));
		
		long time = end - start;
		System.out.println("Time for LinkedList "+ time);
	}
	private static void arrayListTest() {
		long start = System.currentTimeMillis();
		ArrayList<String> names = new ArrayList<String>();
		
		for(int i=0;i < iteration;i ++)
		{
			names.add("User"+i);	
		}
		long end = System.currentTimeMillis();
		System.out.println("Index of "+names.indexOf("User1"));
		
		long time = end - start;
		System.out.println("Time for arraylist "+ time);
	}
	private static void hashMapTest()
	{
		long start = System.currentTimeMillis();
		Hashtable<Integer,String> names = new Hashtable<Integer,String>();
		
		for(int i=0;i < iteration;i ++)
		{
			names.put(i,"User"+i);	
			//names.put(i,"User"+i);	
		}
		long end = System.currentTimeMillis();
		System.out.println("Get key of "+names.get(1));
		
		
		long time = end - start;
		System.out.println("Time for hashmap "+ time);
	}
	public static void main(String[]args)
	{
		hashMapTest();
		arrayListTest();
		linkedListTest();
		
	}

	
}

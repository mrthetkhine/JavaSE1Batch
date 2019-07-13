package chapter19;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[]args)
	{
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("One");
		linkedList.add("Two");
		
		linkedList.addFirst("First");
		linkedList.addLast("Last");
		
		String indexFour = linkedList.get(3);
		System.out.println("Index "+indexFour);
		
		//Collections.sort(linkedList);
		Collections.shuffle(linkedList);
		for(String s : linkedList)
		{
			System.out.println("Item "+s);
		}
	}
}

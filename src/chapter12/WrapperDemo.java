package chapter12;

import java.util.ArrayList;

public class WrapperDemo {
	
	public static void main(String[]args)
	{
		long pLong = 12;
		Long wrapperLong = pLong;//Boxing
		System.out.println(wrapperLong + 20 );//Unboxing
		
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b);//
		System.out.println(a.intValue() == b.intValue());
		
		ArrayList<Integer> myList  = new ArrayList<Integer>();
	}
}

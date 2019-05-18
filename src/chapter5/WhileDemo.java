package chapter5;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[]args)
	{
		int[] arr = {10,20,30,40,50,60,70};
		
		Scanner scanner = new Scanner(System.in);
		int key ;
		
		System.out.println("Enter a key to find");
		key = scanner.nextInt();
		
		int i=0;
		boolean found = false;
		while( i < arr.length)
		{
			System.out.println("Loop "+i);
			if( arr[i] == key)
			{
				System.out.println("Key Found at "+i);
				found = true;
				break;
			}
			i++;
		}
		if( !found )
		{
			System.out.println("Key not found");
		}
	}
}

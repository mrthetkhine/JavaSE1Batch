package chapter5;

import java.util.Scanner;

public class SwtichDemo {
	
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		int digit;
		
		System.out.println("Enter digit");
		digit = scanner.nextInt();
		
		switch( digit )
		{
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("None of the above");
		}
		
	}
	
}

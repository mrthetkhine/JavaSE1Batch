package chapter5;

import java.util.Scanner;

public class StudentExamElseIfVersion {
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int mark;
		System.out.println("Enter mark");
		mark = scanner.nextInt();
		
		if( mark >= 80)
		{
			System.out.println("Pass with distinction");
		}
		else if( mark >= 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

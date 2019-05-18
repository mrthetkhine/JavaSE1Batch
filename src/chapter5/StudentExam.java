package chapter5;

import java.util.Scanner;

public class StudentExam{

	public static void main(String[]args)
	{
		final int PASS_MARK = 40;
		final int DISTINCTION_MARK = 80;
		
		Scanner scanner = new Scanner(System.in);
		
		int myan, eng, math;
		
		System.out.println("Enter myan mark");
		myan = scanner.nextInt();
		
		System.out.println("Enter eng mark");
		eng = scanner.nextInt();
		
		System.out.println("Enter math mark");
		math = scanner.nextInt();
		
		if( myan >= PASS_MARK && eng >= PASS_MARK && math >= PASS_MARK)
		{
			if( myan >= DISTINCTION_MARK 
					|| eng >= DISTINCTION_MARK 
					|| math >= DISTINCTION_MARK )
			{
				System.out.println("Pass with distinction");
			}
			else
			{
				System.out.println("Pass");
			}
			
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
}

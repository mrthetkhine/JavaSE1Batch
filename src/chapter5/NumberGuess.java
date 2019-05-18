package chapter5;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[]args)
	{
		
		int number = (int)(Math.random()*10 +1 );
		
		Scanner scanner = new Scanner(System.in);
		
		int guess ;
		int tries = 0;
		
		do
		{
			System.out.println("Enter a guess");
			guess = scanner.nextInt();
			
			if( guess > number)
			{
				System.out.println("Too large");
			}
			else if( guess < number)
			{
				System.out.println("Too small");
			}
			tries ++;
		}while( number != guess);
		
		System.out.println("You guessed correct at "+ tries);
	}
}

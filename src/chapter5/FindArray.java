package chapter5;

import java.util.Scanner;

public class FindArray {
	public static void main(String[]args)
	{
		int[][] arr = {
				{1,2,3,4,5,6,7,8},
				{9,10,11,12},
				{13,14,15}
		};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a key ");
		int key = scanner.nextInt();
		
		outer:for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(" I "+i);
			for(int j=0; j < arr[i].length;j ++)
			{
				System.out.println("J "+j);
				if( arr[i][j] == key)
				{
					System.out.println("Key found at i"+i + " j "+j);
					break outer;
				}
			}
		}
	}
}

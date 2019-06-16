package chapter13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {
	public static void main(String[]args)
	{
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		char ch = ' ';
		String str= "";
		do
		{
			try
			{
				str = br.readLine();
				System.out.println("String "+str);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}while(!str.equals("stop"));
	}
}

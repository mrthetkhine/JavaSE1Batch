package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	public static void main(String[]args)
	{
		String fileName = "/Project/Java/DefaultImplmenetation.java";
		
	
		try(FileInputStream fin = new FileInputStream(fileName); 
			FileOutputStream fout =  new FileOutputStream("Hello.txt");)
		{
			
			
			int i;
			do
			{
				i = fin.read();
				if( i != -1)
				{
					System.out.print((char)i);
					fout.write(i);
				}
			}while( i != -1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

package chapter18;

import java.io.IOException;

public class CallExternalProgram {

	public static void main(String[]args)
	{
		try {
			Runtime.getRuntime().exec("mkdir hello");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

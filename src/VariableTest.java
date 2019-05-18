
public class VariableTest {

	public static void main(String[]args)
	{
		byte myByte = 13;
		short myShort = 10;
		long myLong = 200_00_1___1;
		int myInt = 10;
		
		char myChar = 'A';
		
		float myFloat = 10.f;
		double myDouble = 13.1;
		
		boolean myBoolean = true;
		
		myShort = myByte;
		myByte = (byte) myInt;
		myByte = (byte) ( myByte + myByte);
		
		myFloat = myFloat - 1;
		
		myFloat = myFloat - myChar;
		myChar++;
		
		myFloat += myDouble;
		
		myFloat = 0.0f / 0;
		System.out.println( myFloat );
		System.out.println( myFloat == myFloat );
		
	}
}

package chapter4;

public class RelationOperator {
	public static void main(String[]args)
	{
		double myDouble = 0 /.0;
		boolean result = myDouble == myDouble;
		System.out.println(result);
		
		if( 3 > 2)
		{
			System.out.println("3 is greater than 2");
		}
		System.out.println();
		
		Integer myIntOne =128;
		Integer myIntTwo = 128;
		System.out.println(myIntOne == myIntTwo);
	}
}

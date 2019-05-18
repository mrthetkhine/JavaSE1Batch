
public class ArrayDemo {
	public static void main(String[]args)
	{
		int arr [] ={1,2,3,4,5,6,7,};
		int [] myArr = new int[5];
		
		System.out.println(arr[6]);
		System.out.println(arr.length);
		System.out.println(arr[1]);
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.println("Arr ["+ i+"] "+ arr[i]);
		}
	}
}

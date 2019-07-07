package chapter18;

public class ArrayCopy {
	public static void main(String[]args)
	{
		int[] arr = {10,20,30,40};
		int[] arr2 = new int[4];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		System.out.println(arr2[1]);
	}
}

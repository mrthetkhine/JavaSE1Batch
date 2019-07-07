package chapter18;

public class Memory {
	public static void main(String[]args)
	{
		Runtime runtime = Runtime.getRuntime();
		Integer arr[] = new Integer[10000];
		
		System.out.println("Total memory "+ runtime.totalMemory());
		System.out.println("Free memory "+ runtime.freeMemory());
		
		arr = null;
		runtime.gc();
		//System.gc();
		System.out.println("Total memory "+ runtime.totalMemory());
		System.out.println("Free memory "+ runtime.freeMemory());
	}
}

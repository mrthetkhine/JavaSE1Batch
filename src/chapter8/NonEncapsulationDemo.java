package chapter8;

public class NonEncapsulationDemo {
	
	private int []arr;
	
	NonEncapsulationDemo()
	{
		arr = new int[10];
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public static void main(String[]args)
	{
		
	}
}

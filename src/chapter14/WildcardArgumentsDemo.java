package chapter14;

class Stats<T extends Number>
{
	T[] nums;
	
	Stats(T[] nums)
	{
		this.nums = nums;
	}
	double average()
	{
		double sum = 0.0;
		for(int i=0;i< nums.length;i++)
		{
			sum += this.nums[i].doubleValue();
		}
		return sum / this.nums.length;
	}
	boolean sameAverage(Stats<?> ob)
	{
		if(average() == ob.average())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class WildcardArgumentsDemo {
	public static void main(String[]args)
	{
		Integer iNums[] = {10,20,30};
		Double dNums[] = {10.0,20.0,30.0};
		
		Stats<Integer> iStat = new Stats<Integer>(iNums);
		Stats<Double> dStat = new Stats<Double>(dNums);
		
		System.out.println("Same average "+ iStat.sameAverage(dStat));
		
	}
}

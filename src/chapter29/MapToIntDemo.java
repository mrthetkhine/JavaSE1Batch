package chapter29;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;

public class MapToIntDemo {
	public static void main(String[]args)
	{
		List<Customer> customers = Customer.getCustomerList();
		Iterator<Integer> iterator  = customers.stream().map(cus->cus.age).iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		Spliterator<Integer> spliterator = customers.stream().map(cus->cus.age).spliterator();
		System.out.println("++++++++++++++");
		while(spliterator.tryAdvance((n)->System.out.println(n) ));
	}
}

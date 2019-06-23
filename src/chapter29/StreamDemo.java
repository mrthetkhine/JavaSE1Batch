package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[]args)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(13);
		list.add(12);
		list.add(25);
		list.add(31);
		
		Stream<Integer> intStream = list.stream();
		Optional<Integer> sum = list.stream()
									.filter(myInt -> myInt % 2==0)
									.reduce((a,b)->{
			System.out.println("A "+a + " B is "+b);
			return a+b;
		});
		System.out.println(sum);
		List<Integer>  inc = intStream
								.filter(myInt-> myInt > 30)
								.map(myInt-> myInt +1)
								.collect(Collectors.toList());
		System.out.println(inc);
	}
}

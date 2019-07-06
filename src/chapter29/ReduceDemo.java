package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[]args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		/*
		Optional<Integer> total = numbers
		.stream()
		.reduce((a,b)->{
			System.out.println("A "+a +" b "+ b);
			return a+b;
		});
		System.out.println(total.get());
		
		Optional<Integer> min = numbers
				.parallelStream()
				.min(Integer::compare);
		
		numbers.forEach(num->{
			//System.out.println("Action for num "+num);
		});
		//System.out.println(min.get());
		*/
		Integer result = numbers
			.parallelStream()
			.reduce(1, (a,b)->{
				System.out.println("Reducer A "+a +" B "+b);
				return a+b;
			},(a,b)->{
				System.out.println("Accumulator A "+a +" b "+b);
				return a*b;
			});
		System.out.println(result);
		
	}
}

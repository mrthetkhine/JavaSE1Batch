package chapter29;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[]args)
	{
		List<Customer> customers= Customer.getCustomerList();
		List<String> names=	customers
			.stream()
			.filter(cus->cus.age >20)
			.map(cus-> "Cusomter "+cus.name)
			.collect(Collectors.toList());
		System.out.println(names);
		
		Optional<Customer> maxCustomer = customers
				.stream()
				.reduce((a,b)->{
					return a.age> b.age ? a : b;
				});
		System.out.println(maxCustomer.get().name);
		
	}

}

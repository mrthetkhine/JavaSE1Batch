package chapter20;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[]args)
	{
		Optional<String> optStr = Optional.empty();
		
		System.out.println(optStr.isPresent());
		optStr = Optional.of("Hello");
		String data = optStr.orElse("Default Value");
		System.out.println(data);
	}
}

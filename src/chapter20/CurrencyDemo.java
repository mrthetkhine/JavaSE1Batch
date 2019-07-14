package chapter20;

import java.util.Calendar;
import java.util.Currency;
import java.util.Formatter;
import java.util.Locale;

public class CurrencyDemo {
	public static void main(String[]args)
	{
		Calendar calendar = Calendar.getInstance();
		Currency currency = Currency.getInstance(Locale.US);
		System.out.println(currency.getCurrencyCode());
		
		Formatter fmt = new Formatter();
		fmt.format("%tB", calendar);
		System.out.println(fmt);
		
		fmt.format("3Digit =%2.3f", Math.PI);
		System.out.println(fmt);
		
	}
}

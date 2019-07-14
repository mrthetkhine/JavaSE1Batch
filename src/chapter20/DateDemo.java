package chapter20;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateDemo {
	public static void main(String[]args)
	{
		String[] months = {"Jan","Feb","Mar"
						,"Apr","May","Jun"
						,"Jul","Aug","Sep"
						,"Oct","Nov","Dec"
				};
		Date date = new Date();
		System.out.println(date);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("Month " +months[calendar.get(Calendar.MONTH)]);
		
		Random random = new Random();
		for(int i=0;i< 5;i++)
		{
			System.out.println(random.nextDouble());
			System.out.println("NextInt "+random.nextInt(10));
		}
	}
}

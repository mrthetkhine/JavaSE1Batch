package chapter30;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class chapter30 {

	public static void main(String[]args)
	{
		Pattern pattern = Pattern.compile("W+");
		Matcher match = pattern.matcher("W hello WWWW WW ");
		
		while(match.find())
		{
			System.out.println("Found at index "+match.start());
		}
		
		//Pattern pattern2  = Pattern.compile("e.+d");
		//Matcher match2 = pattern2.matcher("extend cup table extended");
		
		String email = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		Pattern pattern2  = Pattern.compile(email);
		Matcher match2 = pattern2.matcher("mrthetkhine@gmail.com");
		
		while(match2.find())
		{
			System.out.println("Group "+match2.group());
		}
	}
}

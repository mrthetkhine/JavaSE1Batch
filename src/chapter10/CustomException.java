package chapter10;

class UserNameNotFoundException extends Exception
{
	String userName;
	
	UserNameNotFoundException(String name)
	{
		this.userName = name;
	}
	public String toString()
	{
		return "User name "+this.userName + " Not exist in DB";
	}
	
}
class InvalidAccessException extends Exception
{
	String userName;
	
	InvalidAccessException(String name)
	{
		this.userName = name;
	}
	public String toString()
	{
		return "User name "+this.userName + " Have no access in system";
	}
}
public class CustomException {
	
	static void method(String name)throws UserNameNotFoundException,InvalidAccessException
	{
		if( "noaccess".equals(name))
		{
			throw new InvalidAccessException(name);
		}
		else if("notfound".equals(name))
		{
			throw new UserNameNotFoundException(name);
		}
	}
	public static void main(String[]args)
	{
		try
		{
			method("notfound");
		} 
		catch(InvalidAccessException e)
		{
			System.out.println(e);
		}
		catch(UserNameNotFoundException e)
		{
			System.out.println(e);
		}
	}

}

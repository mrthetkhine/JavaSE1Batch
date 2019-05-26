package chapter8;

abstract class Validator
{
	abstract boolean validate(String obj);
	
}
class EmailValidator extends Validator
{
	
	boolean validate(String email)
	{
		System.out.println("Email validator");
		return true;
	}
}
class PhoneValidator extends Validator
{
	boolean validate(String phone)
	{
		System.out.println("Phone validator");
		return true;
	}
}
public class PolymorphismDemo {
	public static void main(String[]args)
	{
		Validator validator = new EmailValidator();
		validator.validate("");
		
		validator = new PhoneValidator();
		validator.validate("");
	}
}

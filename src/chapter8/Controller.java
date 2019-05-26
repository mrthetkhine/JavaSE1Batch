package chapter8;

abstract class FrameworkController
{
	public void processRequest()
	{
		System.out.println("Process request");
	}
	abstract void businessLogic();
	
	public void processResponse()
	{
		System.out.println("Process response");
	}
	public void process()
	{
		this.processRequest();
		this.businessLogic();
		this.processResponse();
	}
}
class LoginController extends FrameworkController
{

	@Override
	void businessLogic() {
		System.out.println("Process Business Logic Login ");
		
	}
}
class DBController extends FrameworkController
{

	@Override
	void businessLogic() {
		System.out.println("Process Business Logic DB ");
		
	}
}
public class Controller {
	public static void main(String[]args)
	{
		FrameworkController controller = new LoginController();
		controller.process();
		
		controller = new DBController();
		controller.process();
	}
	

}

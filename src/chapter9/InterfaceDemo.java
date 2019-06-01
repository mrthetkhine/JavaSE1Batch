package chapter9;

interface Flyable
{
	void fly();
}
interface Drivable 
{
	void drive();
}
class Bird implements Flyable
{

	@Override
	public void fly() 
	{
		System.out.println("Bird flying ");
	}
}
class Aeroplane implements Flyable, Drivable
{
	@Override
	public void fly() {
		System.out.println("Aeroplance flying");	
	}

	@Override
	public void drive() {
		System.out.println("Aeroplane Driving");
	}
}
class Car implements Drivable
{

	@Override
	public void drive() {
		System.out.println("Car driving");
		
	}
	
}
public class InterfaceDemo {
	public static void main(String[]args)
	{
		Flyable flyable = new Bird();
		flyable.fly();
		
		flyable = new Aeroplane();
		flyable.fly();
		
		Drivable drivable = new Aeroplane();
		drivable.drive();
		
		drivable = new Car();
		drivable.drive();
	}
}

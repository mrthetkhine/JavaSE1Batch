package chapter6;

public class Item {
	int code;
	String name;
	double price;
	int quantity;
	 
	Item()
	{
		System.out.println("Run no arguemnt construtor");
	}
	Item(int code, String name, double price, int quantity)
	{
		this.code = code;
		this.name = name;
		
		this.price = price;
		this.quantity = quantity;
		System.out.println("Run Argument constructor");
	}
	public void show()
	{
		System.out.println("Code "+code + " Name "+ name + " Price "+ price 
				+ " Quantity "+quantity + " Total "+(price* quantity));
	}
	public static void main(String args[])
	{
		Item itemOne = new Item();
		System.out.println("Item 1 code "+ itemOne.code);
		itemOne.code = 1;
		itemOne.name = "Apple";
		itemOne.price = -10;
		itemOne.quantity = 4;
		
		Item itemTwo = new Item(2,"Orange",20,5);
		
		itemOne.show();
		itemTwo.show(); 
	}
}

package chapter12;

enum Coffee
{
	Capachino(100), Mocha(150), Lattie(145),Espresso(130);
	
	int price;
	
	Coffee(int price)
	{
		this.price = price;
	}
	int getPrice()
	{
		return this.price;
	}
}
public class EnumDemo {
	public static void main(String[]args)
	{
		Coffee coffee = Coffee.Mocha;
		coffee  = Coffee.Lattie;
		
		if(coffee == Coffee.Mocha)
		{
			System.out.println("Coffee Mocha");
		}
		else if(coffee == Coffee.Lattie)
		{
			System.out.println("Coffee Lattie");
		}
		System.out.println("Coffee is "+coffee);
		
		for(Coffee cof : Coffee.values())
		{
			System.out.println(cof);
		}
		Coffee mocha = Coffee.valueOf("Mocha");
		System.out.println(mocha +" Price "+mocha.getPrice() );
		System.out.println("Mocha ordinal "+mocha.ordinal());
		
		System.out.println("Compare to "+coffee.compareTo(mocha));
	}

}

package chapter9;


interface Callback
{
	void callMeBack();
}
class BookStore 
{
	Callback callback;
	void notifyMeWhenBookArrive(Callback callback)
	{
		this.callback = callback;
	}
	void bookArrive()
	{
		System.out.println("Book Arrive at store, call back to buyer");
		this.callback.callMeBack();
	}
}
class BookBuyer implements Callback
{
	String name;
	
	BookBuyer(String name)
	{
		this.name = name;
	}

	@Override
	public void callMeBack() {
		System.out.println("Hi " +this.name+"New book arrived ");
	}
}

public class CallbackDemo {

	public static void main(String[]args)
	{
		BookStore store = new BookStore();
		BookBuyer myaMya = new BookBuyer("MyaMya");
		
		store.notifyMeWhenBookArrive(myaMya);
		store.bookArrive();
	}
}

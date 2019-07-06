package chapter29;

import java.util.ArrayList;
import java.util.List;

class Customer
{
	int id;
	String name;
	int age;
	Customer(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void receiveGift()
	{
		System.out.println("You receive gift "+this.name);
	}
	static List<Customer> getCustomerList()
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"One",20));
		customers.add(new Customer(2,"Two",10));
		customers.add(new Customer(3,"Three",25));
		customers.add(new Customer(4,"Four",35));
		return customers;
	}
}

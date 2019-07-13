package chapter19;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer>
{
	String name;
	int age;
	Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Customer o) {
		if( this.age == o.age)
		{
			return this.name.compareTo(o.name);
		}
		else
		{
			return this.age - o.age;
		}
		
	}
	public String toString()
	{
		return "Name "+ this.name + " Age "+this.age;
	}
	
}
public class CustomSortDemo {
	public static void main(String[]args)
	{
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Aung Aung",21));
		customerList.add(new Customer("Mg Mg",31));
		customerList.add(new Customer("Soe Min",10));
		customerList.add(new Customer("Aung Min",10));
		//customerList.add(new Customer("Aung Lay",10));
		Collections.sort(customerList);
		for(Customer c : customerList)
		{
			System.out.println(c);
		}
			
		
	}
}

package chapter9;

import java.util.ArrayList;
import java.util.List;

interface MessageCallback
{
	void newMessage(String message);
}
class MessengerGroup 
{
	List<MessageCallback> members = new ArrayList<MessageCallback>();
	
	public void join(MessageCallback member)
	{
		this.members.add(member);
	}
	void sendMessage(String message)
	{
		for(MessageCallback member : this.members)
		{
			member.newMessage(message);
		}
	}
}
class Member implements MessageCallback
{
	String name ;
	
	Member(String name)
	{
		this.name = name;
	}
	public void newMessage(String message)
	{
		System.out.println("Name "+name + ":"+message);
	}
}
public class ChatRoom {

	public static void main(String[] args)
	{
		MessengerGroup messenger = new MessengerGroup();
		Member mgmg = new Member("MgMg");
		Member aungAung = new Member("AungAung");
		Member hlaHla  = new Member("Hla Hla");
		
		messenger.join(mgmg);
		messenger.join(aungAung);
		messenger.join(hlaHla);
		
		messenger.sendMessage("Message 1");
		messenger.sendMessage("Message 2");
	}
}

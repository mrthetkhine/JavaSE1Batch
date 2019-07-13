package chapter19;

import java.util.Queue;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[]args)
	{
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("One");
		queue.add("Two");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}

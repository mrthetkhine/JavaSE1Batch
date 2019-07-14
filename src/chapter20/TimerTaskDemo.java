package chapter20;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask
{
	public void run()
	{
		System.out.println("Timer run");
	}
}
public class TimerTaskDemo {
	
	public static void main(String[]args)
	{
		Timer timer = new Timer();
		MyTask task = new MyTask();
		
		timer.schedule(task, 1000, 500);
	}

}

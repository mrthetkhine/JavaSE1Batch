package chapter11;
 class Q
 {
	 int n =-1;
	 boolean valueSet = false;
	 
	 synchronized public void put(int n)
	 {
		 while( valueSet)
		 {
			 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 this.n = n;
		 this.valueSet = true;
		 System.out.println("Put "+n);
		 notify();
	 }
	 synchronized public int get()
	 {
		 while(!valueSet)
		 {
			 try 
			 {
				wait();
			 } catch (InterruptedException e) 
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 System.out.println("Get "+n);
		 this.valueSet = false;
		 notify();
		 return this.n;
	 }
 }
 class Producer extends Thread
 {
	 Q q;
	 Producer(Q q)
	 {
		 this.q = q;
	 }
	 
	 public void run()
	 {
		 int i=0;
		 while(i < 10)
		 {
			 q.put(i++);
		 }
	 }
 }
 class Consumer extends Thread
 {
	 Q q;
	 Consumer(Q q)
	 {
		 this.q = q;
	 }
	 
	 public void run()
	 {
		 int i=0;
		 while(i< 10)
		 {
			 q.get();
			 i++;
		 }
	 }
 }
public class ProducerConsumerQueue {

	public static void main(String[]args)
	{
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();
	}
}

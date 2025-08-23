package Muti_Threading;
class Simple
{
	void waitforsignals() throws InterruptedException {
	synchronized(this) {
		System.out.println("Waiting");
		wait();
		
		System.out.println("Resume");
	}
	}
	void givesignal()
	{
		synchronized(this)
		{
			notify();
			
		}
	}
}
public class Wait_notify {

	public static void main(String[] args) {
		Simple s=new Simple();
		Thread t1=new Thread(()->
		{
			try {
				s.waitforsignals();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		});
		Thread t2=new Thread(()->{
		try {
			Thread.sleep(5000);
			s.givesignal();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	});
		t1.start();
		t2.start();
	}

}
//Show how to stop a thread using a boolean flag.
//Implement a BankAccount class accessed by multiple threads to 
//deposit and withdraw money. Use synchronization.

class TestSync implements Runnable
{
	private int balance=0;

	public void run()
	{
		for (int i=0; i<50; i++)
		{
			increment();
			System.out.println(Thread.currentThread().getName() +" balance is "+ balance);
		}
	}

	private synchronized void increment()
	{
		int i = balance;
		balance = i + 1;
	}

}




public class TestSyncTest
{
	public static void main(String[] args)
	{
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("A");
		b.setName("B");
		a.start();
		b.start();
	}
}
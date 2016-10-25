class MyRunnable implements Runnable
{
	public void run()
	{
		doMore();
	}

	public void doMore()
	{
		System.out.println("top of the stack");
	}
}



public class ThreadTester
{
	public static void main(String[] args)
	{
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		myThread.start();
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("back in main");
	}
}
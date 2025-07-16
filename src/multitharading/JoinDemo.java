package multitharading;

class JoinDem extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Method is Running");
			try {
				
				Thread.sleep(1000);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class JoinDemo 
{

	public static void main(String[] args) throws InterruptedException
	{
		JoinDem jd = new JoinDem();
		JoinDem jd1 = new JoinDem();
		JoinDem jd3 = new JoinDem();
		jd.start();
		jd.join();
		
		jd1.start();
		jd3.start();
		System.out.println("main Method is Ending");
		
		
	}
}

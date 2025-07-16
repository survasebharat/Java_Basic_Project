package multitharading;

class ThreadDemo3 extends Thread
{
	@Override
	public void run() {
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("i value is"+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class SleepMethod {

	public static void main(String[] args) {
		
		ThreadDemo3 td =  new ThreadDemo3();
		td.start();
		
	}
}

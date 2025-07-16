package multitharading;
class dustaf extends Thread
{
	@Override
	public void run() {
	
		String name = Thread.currentThread().getName();
		System.out.println("name ="+name);
		super.run();
	}
}
public class Demo {

	public static void main(String[] args) {
		
		dustaf sd = new dustaf();
		sd.start();
		System.out.println("Thread is Running "+Thread.currentThread().getName());
	}
}

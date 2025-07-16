package multitharading;

class ThreadDemo extends Thread
{
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"Thread is Running");
		super.run();
	}
}
public class Demo2 {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		
		td.setName("new Thread");
		td.start();
		String name =Thread.currentThread().getName();
		System.out.println(name);
	}
}

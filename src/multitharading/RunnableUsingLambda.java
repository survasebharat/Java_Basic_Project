package multitharading;

public class RunnableUsingLambda {

	public static void main(String[] args) {
		
		System.out.println("main Thread is Strated");
		
		Runnable r = ()-> 
		{
			String name =Thread.currentThread().getName();
			System.out.println(name);
		};
		Thread th  = new Thread();
		th.start();
	}
}

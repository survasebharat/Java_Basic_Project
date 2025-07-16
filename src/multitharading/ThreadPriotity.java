package multitharading;

public class ThreadPriotity {

	public static void main(String[] args) {
		
		Thread th  = new Thread();
	
		System.out.println(th.getPriority());
		try {
			
			System.out.println("set Priority "+th.getPriority());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

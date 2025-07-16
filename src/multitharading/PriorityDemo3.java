package multitharading;

public class PriorityDemo3 {

	public static void main(String[] args) {
		
		Thread th = new Thread();
		th.setPriority(29);
		Thread th1 = new Thread();
		
		System.out.println(th.getPriority());
		System.out.println(th1.getPriority());
	}
}

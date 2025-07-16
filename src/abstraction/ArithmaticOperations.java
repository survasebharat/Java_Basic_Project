package abstraction;

public class ArithmaticOperations extends Calculate
{

	@Override
	public void dosum(int x, int y) {
		
		System.out.println("Addition ="+ x+y);
		
	}

	@Override
	public void square(int x) {
		System.out.println("Substraction  ="+x*x);
		
	}

	@Override
	public void cube(int y) {
		System.out.println("cube ="+y*y*y);
		
	}

}

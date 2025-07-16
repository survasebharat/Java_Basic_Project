package abstraction;

sealed interface Moveable permits Car
{
	int speed =100;
	void  move();
	
}
non-sealed class Car implements Moveable
{

	@Override
	public void move() {
		
		System.out.println("Moveable with My Car Speed id"+speed);
		
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		Car ca  = new Car();
		ca.move();
		
	}
}

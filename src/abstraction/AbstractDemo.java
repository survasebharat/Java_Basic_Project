package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape s ;
		s= new Rectangle();
		s.draw();
		s= new Square();
		s.draw();
	}
}

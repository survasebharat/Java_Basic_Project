package exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		Exception e = new ArithmeticException();
		System.out.println( e);
		
		Exception e1 = new ArithmeticException("Arithmatic Exceptions");
		System.out.println(e1);
	}
}

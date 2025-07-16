package exception;

public class ExceptionDemoma {

	public static void main(String[] args) {
		
		System.out.println("main Method is Strated");
		
		try 
		{
			int c = 10/0;
			System.out.println("c ="+c);
			
			int []x= {10,20,30};
			System.out.println("x[] = "+x[3]);
		} 
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			e2.printStackTrace();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Main Methos Is Ended");
	}
}

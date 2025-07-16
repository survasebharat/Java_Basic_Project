
package exception;

public class PrintStackTraceDemo {

	public static void main(String[] args) {
		
		System.out.println("main Method Strated");
		try {
			
			String str = "Nit";
			int i = Integer.parseInt(str);
			System.out.println(i);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("---------------------");
			System.err.println("--------------------");
			System.out.println("--"+e.getMessage());
			System.out.println("---------------");
			System.out.println(""+e.toString());
			
		}
		System.out.println("main method will be Printed");
	}
}

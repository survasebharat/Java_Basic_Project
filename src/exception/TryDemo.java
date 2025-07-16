package exception;

import java.util.Scanner;

public class TryDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Methosd is Strated");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a Number");
			int a = sc.nextInt();
			System.out.println("Enter b Number");
			int b = sc.nextInt();
			int c= a/b;
			System.out.println("Result is ="+c);
			System.out.println("Program Will Be the End");
		} catch (Exception e) {
			
			System.out.println("Enside  the Catch Block");
			System.err.println(e);
		}
		System.out.println("End Of the Main Method");
		sc.close();
	}
}

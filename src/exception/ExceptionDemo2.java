package exception;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a Frist value");
		int a = sc.nextInt();
		System.out.println("Enter a Second Value");
		int b = sc.nextInt();
		
		int c = a/b;
		System.out.println("result is "+c);
		System.out.println("Main Method is a Ended");
		sc.close();
	}
}

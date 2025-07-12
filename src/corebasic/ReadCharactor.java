package corebasic;

import java.util.Scanner;

public class ReadCharactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		char gender = sc.next().charAt(2);
		
		System.out.println("your Generator is "+gender);
	}
}

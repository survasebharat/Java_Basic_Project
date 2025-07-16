package exception;

import java.io.IOException;
import java.util.Scanner;

public class InputMissmatchExceptionDemo 
{

	public static void main(String[] args)throws  IOException
	{
		
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			
			System.out.println("Enter the Integer Number");
			int i = sc.nextInt();
			System.out.println("i ="+i);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		sc.close();
		System.out.println("main Method Ended");
}
}
package iostream;

import java.time.LocalDate;
import java.util.Scanner;

class Product extends Thread
{
 
	@Override
	public void run() {
		System.out.println("thread Methos is Running");
		super.run();
	}
	
}
public class StoredPRoductDemo {

	public static void main(String[] args) {
		
		System.out.println("main Methosd is Strated");
		
		Product p = new Product();
		p.start();
	}
}

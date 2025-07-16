package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arl = new ArrayList<>();
		
		arl.add("apple");
		arl.add("orange");
		arl.add("Graps");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");
		Collections.sort(arl);
		System.out.println("In Anseding order");
		arl.forEach(System.out::println);
		Collections.reverse(arl);
		System.out.println("Desending  Order");
		arl.forEach(System.out::println); 
		
	}
}

package collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		
		Vector<String> fruits = new Vector<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("Gauva");
		fruits.add("Kivi");
		
		System.out.println(fruits);
		fruits.remove(4);
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());
		Collections.sort(fruits);
		fruits.forEach(System.out::println);
		
	}
}

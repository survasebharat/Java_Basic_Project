package collection;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector<String> fruits = new Vector<>();
		fruits.add("ram");
		fruits.add("add");
		fruits.add("sub");
		fruits.add("multi");
		
		fruits.forEach(fruit -> System.out.println(fruit));
	}
}

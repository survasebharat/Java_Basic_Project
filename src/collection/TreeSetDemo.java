package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		// treeset do not get Doublicate Value 
		TreeSet<Object> is = new TreeSet<>();
		is.add("ram");
		is.add("ram");
		is.add("2");
		is.add("a");
		is.add("hohan");
		System.out.println("treeset is ="+is);
	}
}

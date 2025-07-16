package mappackage;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
		l.put(1, "A");
		l.put(2, "B");
		l.put(3, "c");
		l.put(4, "E");
		l.put(5, "E");
		System.out.println(l);
	}
}

package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		List<Object> list = new LinkedList<>();
		
		list.add("ram");
		list.add('A');
		list.add(89);
		list.add(83.3);
		list.add(782.3f);
		System.out.println("list "+list.get(1));
		
		Iterator<Object> it = list.iterator();
		it.forEachRemaining(System.out::println);
	}
}

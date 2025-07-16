package collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		SortedSet<Integer> it = new TreeSet<>();
		it.add(74);
		it.add(4);
		it.add(724);
		it.add(74);
		it.add(23);
		it.add(12);
		it.add(65);
		System.out.println(it);
		
		NavigableSet<String> ns = new TreeSet<>();
		ns.add("apple");
		ns.add("mango");
		ns.add("tur");
		ns.add("banana");
		ns.add("orange");
		ns.add("paynaapple");
		ns.add("masur");
		ns.add("apple");
		
		System.out.println(ns);
	}
}

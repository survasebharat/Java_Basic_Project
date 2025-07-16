package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareToMEthod {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(45);
		al.add(32);
		al.add(45);
		al.add(78);
		al.add(96);
		
		Comparator<Integer> desc = (i1,i2) -> i2.compareTo(i1);
		Collections.sort(al, desc);
		al.forEach(System.out::println);
	}
}

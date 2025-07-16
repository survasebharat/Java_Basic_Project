package collection;

import java.util.Arrays;
import java.util.List;

public class ImmutableArrayList {

	public static void main(String[] args) {
		
		List<String> listofname = Arrays.asList("scotte","smith","mathion","john");
		
		listofname.forEach(System.out::println);
		listofname.set(0, "virat");
		listofname.forEach(System.out::println);
	}
}

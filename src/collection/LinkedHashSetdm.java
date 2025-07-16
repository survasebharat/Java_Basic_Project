package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetdm {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("add");
		lhs.add("sub");
		lhs.add("modify");
		lhs.add("div");
		lhs.add("module");
		lhs.forEach(str -> System.out.println(str));
	}
}

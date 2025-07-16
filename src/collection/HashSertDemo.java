package collection;

import java.util.HashSet;

public class HashSertDemo {

	public static void main(String[] args) {
		
		HashSet<Object>  hs = new HashSet<>();
		hs.add(39);
		hs.add(3820);
		hs.add(81);
		hs.add(18);
		hs.add(39);
		hs.add(29);
		hs.add(null);
		hs.add(null);
		
		hs.forEach(str -> System.out.println(str));
		
		
	}
}

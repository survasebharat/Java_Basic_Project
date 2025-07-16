package mappackage;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		
		hm1.put("A",21);
		hm1.put("ram", 90);
		hm1.put("B", 87);
		hm1.put("lakhan", 65);
		hm1.put(new String("A"),3);
		System.out.println(hm1.size());
		System.out.println(hm1);
	}
}

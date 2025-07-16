package mappackage;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("one", "amer");
		map.put("two", "ram");
		map.put("three", "rohan");
		map.put("four", "pavan");
		map.put("five", "soham");
		map.put("six", "samir");
		
		System.out.println(map);
		map.forEach((k,v) -> System.out.println("key is "+k+" value = "+v));
	}
}

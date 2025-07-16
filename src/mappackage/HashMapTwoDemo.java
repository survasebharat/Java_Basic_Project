package mappackage;

import java.util.HashMap;

public class HashMapTwoDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm =new HashMap<>();
		hm.put(1, "bharat");
		hm.put(2, "rohan");
		hm.put(3, "laxuman");
		hm.put(4, "roina");
		hm.put(5, "paiya");
		
		System.out.println("to Chack the key "+hm.containsKey(2));
		
		System.out.println("to Check tje value ="+hm.containsValue("rohan"));
		
		System.out.println("to check the Size "+hm.size());
		
		hm.clear();
		System.out.println(hm);
	}
}

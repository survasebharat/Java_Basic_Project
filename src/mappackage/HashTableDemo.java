package mappackage;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hash= new Hashtable<>();
		hash.put(1, "A");
		hash.put(2, "B");
		hash.put(3, "C");
		hash.put(4, "D");
		hash.put(5, "E");
		hash.put(6, "F");
		System.out.println(hash);
		
		
	}
}

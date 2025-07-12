package corebasic;

import java.util.Arrays;

public class InhancedForLoop {

	public static void main(String[] args) {
		
		String []arr = {"Ram","Laxuman","Amer","Rohan"};
		
		Arrays.sort(arr);
		
		for (String st: arr) {
			System.out.println(st);
		}
	}
}

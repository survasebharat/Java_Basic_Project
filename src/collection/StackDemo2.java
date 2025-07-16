package collection;

import java.util.Stack;

public class StackDemo2 {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		st.push("ram");
		st.push("laxuman");
		st.push("sheta");
		st.push("bharat");
		st.push("ankush");
		st.forEach(x ->System.out.println(x));
		
		Stack<Character> in = new Stack<>();
		in.add('A');
		in.add('B');
		in.add('c');
		in.add('D');
		in.forEach(y ->System.out.println(y));
		
		
				
	}
}

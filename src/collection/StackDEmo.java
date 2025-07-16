package collection;

import java.util.Stack;

public class StackDEmo {

	public static void main(String[] args) {
		
		try {
			
			Stack<Integer> it = new Stack<>();
			it.push(10);
			it.push(20);
			it.push(30);
			it.push(40);
			it.push(50);
			System.out.println("After Insertion elements are ="+it);
			
			System.out.println(it.pop()); //show and reomove the out of stack
			System.out.println(it);
			
			System.out.println(it.peek());
			System.out.println(it.peek());
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

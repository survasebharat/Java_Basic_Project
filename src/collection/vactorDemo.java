
package collection;

import java.util.Iterator;
import java.util.Vector;

public class vactorDemo {

	public static void main(String[] args) {
		
		Vector<Object> ve = new Vector<>();
		ve.add("39");
		ve.add('a');
		ve.add("ram");
		ve.add(32.2f);
		ve.add(892.0d);
		
		System.out.println("Using the toString Method");
		System.out.println(ve.toString());
		
		System.out.println("Using For Loop");
		for(int i=0;i<ve.size();i++)
		{
			System.out.println(ve.get(i));
		}
		System.out.println("using foreach looop");
		for(Object v:ve)
		{
			System.out.println(v);
		}
		
		System.out.println("using iterator");
		Iterator<Object> itr = ve.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("backword Diraction");
		
		
	}
}

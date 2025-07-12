package jvm;

class Foo1
{
	final static int x;
	static
	{
		x=90;
		System.out.println("x value = "+x);
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		Foo1 f = new Foo1();
	}
}

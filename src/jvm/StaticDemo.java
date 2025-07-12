package jvm;

class Test
{
	static int x;
	static 
	{
		x=100;
		System.out.println("the value is "+x);
		
	}
	static
	{
		x = 200;
		System.out.println("the value is "+x);
	}
	static
	{
		x = 300;
		System.out.println("tha valve of x ="+x);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		
		System.out.println("main methos is printing");
		System.out.println(Test.x);
	}
}

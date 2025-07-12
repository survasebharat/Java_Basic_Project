package jvm;

class Alpha
{
	static
	{
		System.out.println("Alpha class methos");
	}
}
class Beta extends Alpha
{
	static
	{
		System.out.println("beta class method");
	}
}
public class InteritanceDemo {

	public static void main(String[] args) {
		
		new Beta();
	}
}

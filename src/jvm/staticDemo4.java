package jvm;

class Test1
{
	int var;
	public Test1(int var) 
	{
		this.var = var;
		System.out.println("var is ="+var);
		
	}
	public static void mathod()
	{
		System.out.println("static method are");
	}
}
public class staticDemo4 {

	public static void main(String[] args) {
		
		Test1 te = new Test1(32);
		Test1.mathod();
	}
}

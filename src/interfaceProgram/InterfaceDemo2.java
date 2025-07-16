package interfaceProgram;

interface AA
{
	default void m1()
	{
		System.out.println("Interface Defoult Methos will be Print");
	}
}
class BB
{
	public void m1()
	{
		System.out.println("Class MEthod Will be PRinted");
	}
	
}
class C extends BB implements AA
{
	
}
public class InterfaceDemo2 
{

	public static void main(String[] args) {
		
		C ca = new C();
		ca.m1();
	}
}

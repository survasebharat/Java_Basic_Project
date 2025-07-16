package interfaceProgram;

interface A
{
	void m1();
}
interface B 
{
	void m1();
}
class Implementer implements A,B
{

	@Override
	public void m1() {
		System.out.println("Multiple Interitance Are Possible in Interface");
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
	
		Implementer im = new Implementer();
		im.m1();
	}
}

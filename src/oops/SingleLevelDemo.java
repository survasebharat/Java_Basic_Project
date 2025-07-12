package oops;

class Father
{
	protected double salary  = 12000;
	public void Car()
	{
		System.out.println("my New Car");
	}
}
class Son extends Father
{
	protected double salary = 1000;
	public void House()
	{
		System.out.println("My new house");
	}
	public void dispaly()
	{
		System.out.println("salary ="+salary);
		System.out.println("salary ="+super.salary);
	}
}
public class SingleLevelDemo {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.Car();
		s.House();
		s.dispaly();
				
	}
}

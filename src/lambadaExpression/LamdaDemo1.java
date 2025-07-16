package lambadaExpression;

interface Vahical
{
	void run();
}
public class LamdaDemo1 {
	
	public static void main(String[] args)
	{
		Vahical car = ()->System.out.println("Car is Running");
		Vahical Bike = ()->System.out.println("Bike is Running");
		Vahical bus = ()->System.out.println("Bus is Running");
		
		car.run();
		bus.run();
		Bike.run();
	}
}

package oops;

class Cust
{
	int id;
	String name;
	public Cust(int id,String name) 
	{
		this.id = id;
		this.name = name;
		
	}
	public void showData()
	{
		System.out.println("your Id ="+id);
		System.out.println("your Name = "+name);
	}
}
public class Customer1 {

	public static void main(String[] args) {
		
		Cust cu = new Cust(10, "bharat");
		cu.showData();
		
	}
	
}

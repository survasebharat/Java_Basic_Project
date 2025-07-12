package oops;

public class Customer {

	int CId;
	String CName;
	
	public void show()
	{
		System.out.println("Id Off the customer is = "+CId);
		System.out.println("Name of the customer is= "+CName);
		
	}
	public static void main(String[] args) {
		
		Customer cs = new Customer();
		cs.show();
		
	}
}

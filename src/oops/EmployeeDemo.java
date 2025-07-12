package oops;

class Employee
{
	int ERollNo;
	String EName;
	
	public void setData()
	{
		ERollNo =  101;
		EName  =  "Bharat";
	}
	public void getData()
	{
		System.out.println("Enter roll No is = "+ ERollNo);
		System.out.println("Enter EName is = "+ EName);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee ea = new Employee();
		ea.setData();
		ea.getData();
	}
}

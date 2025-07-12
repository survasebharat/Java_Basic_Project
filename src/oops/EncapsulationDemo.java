package oops;

class Employee1
{
	int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		
		if(employeeId<=0)
		{
			System.out.println("Invalid Emplayee ID");
		}
		else
		{
			this.employeeId = employeeId;
		}
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Employee1 em = new Employee1();
		em.setEmployeeId(12);
		int empid = em.getEmployeeId();
		System.out.println("employeeid ="+empid);
		
	}
}

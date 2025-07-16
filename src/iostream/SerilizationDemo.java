package iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	
	//parameterasied Constuctor
	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
	
	

}
public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("D:\\ram.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		try(fos;oos) 
		{
			Employee em = new Employee(101, "ram", 88282.2d);
			oos.writeObject(em);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program is Turminate");
		
			}
}

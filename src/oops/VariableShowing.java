package oops;

public class VariableShowing {

	int i =22;
	String name = "ram";
	double salary = 90009;
	public void showData(double salary)
	{
		int i = 33;
		String name = "rohan";
		System.out.println("id =" + i);
		System.out.println("name = "+ name);
		System.out.println("salary = "+salary);
	}
	public static void main(String[] args) {
		
		VariableShowing  vs = new VariableShowing();
		vs.showData(8000);
	}
}

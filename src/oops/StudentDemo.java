package oops;

class Student
{
	int studentRollNo;
	String studentName;
	int studentHeight;
	
	public void tock()
	{
	
		System.out.println("StudentRollNo ="+ studentRollNo);
		System.out.println("StudentName ="+studentName);
		System.out.println("Student Height =" +studentHeight);
		
	}
	public void display()
	{
		System.out.println("I am "+studentName+" studening in Java Programming");
	}
	
	
}
public class StudentDemo 
{
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.studentRollNo = 292;
		st.studentName  = "bharat";
		st.studentHeight  = 90;
		
		st.tock();
		st.display();
		
	}

}

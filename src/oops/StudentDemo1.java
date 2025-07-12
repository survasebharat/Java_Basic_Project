package oops;

class Student1
{
	int studentId ;
	String studentName;
	String studentAddrs;
	static String collageName = "kbnmu Jalgaon";
	static String courceName = "Core Java";
	public  Student1(int id, String name, String addrs)
	{
		this.studentId = id;
		this.studentName  = name;
		this.studentAddrs  = addrs;
	}
	
	

	//toString Method
	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + ", studentAddrs=" + studentAddrs
				+ "]";
	}
	
	
	
}
public class StudentDemo1 {

	public static void main(String[] args) {
		
		Student1 st = new Student1(1, "ram", "Latur");
	
		System.out.println(st);
	}
	
}

package oops;

public class PrimativeVariable {

	int x=900; //Non-static variable
	static int y=89; //static avriable
	public static void main(String[] args) {
		
		System.out.println("static variable is = "+ PrimativeVariable.y);
		
		PrimativeVariable pr = new PrimativeVariable();
		System.out.println(pr.x);
		System.out.println();
		accept(600);
		
	}
	
	public  static void accept(int p)
	{
		int local = 9000;
		System.out.println(" p ="+p);
		System.out.println("local is ="+local);
	}
}

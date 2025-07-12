package jvm;


public class StacticDEmo {

	public StacticDEmo() {
		
		System.out.println("Constructor is Colling");
	
	}	
	{
		System.out.println("Non-static Block is Colling");
	}
	static
	{
		System.out.println("static block is colling");
	}
	public static void main(String[] args) {
		
		System.out.println("main methosd is Colling");
	}

}

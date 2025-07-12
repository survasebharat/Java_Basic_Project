package corebasic;

public class InpliciteTypeCasting {

	public static void main(String[] args) {
		//upcasting (Implecite Type Casting)
		byte a = 39;
		short s = a;
		System.out.println(s);
		int i = s;
		System.out.println(i);
		long l = i;
		System.out.println(l);
		float f = l;
		System.out.println(f);
		double d = f;
		System.out.println(d);
		
		//expicate type Casting (Doun Casting)
		
		long la = 48;
		System.out.println(la);
		int ia = (int)la;
		System.out.println(ia);  // douncasting (Expicate Casing)
		short sa = (short)ia;
		System.out.println(sa);  //explcacite cating
		byte ba = (byte)sa;
		System.out.println(ba);
		
		
		
	}
}


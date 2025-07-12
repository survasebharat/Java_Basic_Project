package jvm;

class foo
{
	
}
public class ClassLoaderInfo {

	  public static void main(String[] args) {
		
		  System.out.println("super class loader is the "+foo.class.getClassLoader().getParent());
	}
}

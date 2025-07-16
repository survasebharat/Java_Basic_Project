package multitharading;

class demo3
{
	int id;
	String name;
	
	@Override
	public String toString() {
		return "demo3 [id=" + id + ", name=" + name + "]";
	}
	
}
public class DeepCopy {

	public static void main(String[] args) {
		
		demo3 sm = new demo3();
		sm.id = 83;
		sm.name = "ramdas";
		System.out.println("main Method is Running"+ sm);
		demo3  sm1 = new demo3();
		sm1.id = 21;
		sm1.name = "rohan";
		System.out.println("main Method is Running"+sm1);
	}
}

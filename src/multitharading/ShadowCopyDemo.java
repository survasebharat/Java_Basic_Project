package multitharading;

class shadowCopy
{
	int Id;
	String Name;
	@Override
	public String toString() {
		return "shadowCopy [Id=" + Id + ", Name=" + Name + "]";
	}
	
}
public class ShadowCopyDemo {

	public static void main(String[] args) {
		
		shadowCopy st = new shadowCopy();
		st.Id = 29;
		st.Name = "bharat";
		System.out.println(st);
	}
}

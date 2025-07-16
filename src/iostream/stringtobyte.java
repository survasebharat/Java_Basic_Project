package iostream;

public class stringtobyte {

	public static void main(String[] args) {
		
		String str = "ABCD";
		byte []b = str.getBytes();
		
		for(byte c : b)
		{
			System.out.println("value ="+c);
		}
	}
}

package iostream;

public class ByteintoString {

	public static void main(String[] args) {
		
		byte b = 67;
		String str = new String(new byte[] {b});
		System.out.println(str);
}
}

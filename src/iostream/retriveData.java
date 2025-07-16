package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class retriveData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\ram.txt");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		try(fis;ois) 
		{
			Employee em =(Employee)ois.readObject();
			System.out.println(em);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

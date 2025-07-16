package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWitterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter wr = new FileWriter("D:\\ram.txt");
		try(wr)
		{
			wr.write("India is My cuntary");
			System.out.println("Success...!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

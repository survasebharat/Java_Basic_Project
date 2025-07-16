package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritters {

	public static void main(String[] args) throws IOException {
		
		FileWriter we = new FileWriter("D:\\ram.txt");
		try(we)
		{
			char ch[] = {'A','B','c','D',' ','E','F','G','H'};
			we.write(ch);
			System.out.println("your Content has writted");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
	}
}

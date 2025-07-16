package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileWritter {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fin = new FileInputStream("D:\\ram.txt");
		
		try(fin)
		{
			int i;
			
			while(true)
			{
				i = fin.read();
				if(i==-1)
					break;
				System.out.println((char)i);
			}
				
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

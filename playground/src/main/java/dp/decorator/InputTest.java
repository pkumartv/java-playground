package dp.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	
	public static void main(String[] args) {
		int c;
		try {
			System.out.println(new File(".").getAbsolutePath());
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("Test.txt")));
			
			while((c= in.read()) >=0)
			{
				System.out.print((char)c);
				
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

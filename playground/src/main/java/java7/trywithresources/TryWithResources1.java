package java7.trywithresources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResources1 {

	// try-with-resources - the the best way to close resources!
	static String firstLineOfFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}
	
	
	// try-with-resources on multiple resources - short and sweet
	static void copy(String src, String dst) throws IOException {
	try (
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dst)
		) 
		{
			byte[] buf = new byte[100];
			int n;
			while ((n = in.read(buf)) >= 0)
			out.write(buf, 0,n);
		}
	}

	//Excerpt From: Joshua Bloch. “Effective Java”. Apple Books. 

	// Excerpt From: Joshua Bloch. “Effective Java”. Apple Books.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

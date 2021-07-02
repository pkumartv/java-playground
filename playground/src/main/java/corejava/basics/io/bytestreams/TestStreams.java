package corejava.basics.io.bytestreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class TestStreams {
	InputStream is;
	OutputStream os;
	
	Reader reader;
	Writer writer;

	
	public static void main(String[] args) throws IOException {
		
		char c;
		String input;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters, 'q' to quit");
		
		do {
			//c= (char) br.read();
			input=br.readLine();
			System.out.println(input);
			
			
		} while (input.equalsIgnoreCase("stop"));
	}

}

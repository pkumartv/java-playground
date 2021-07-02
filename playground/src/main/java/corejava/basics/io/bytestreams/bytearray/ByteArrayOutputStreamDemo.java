package corejava.basics.io.bytestreams.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		String s= "This should end up in an array";
		byte [] buf=s.getBytes();
		
		ByteArrayOutputStream f= new ByteArrayOutputStream();
		
		try {
			f.write(buf);
		} catch (IOException e) {
			System.out.println("Error writing to buffer");
			return;
			// TODO: handle exception
		}

		
		System.out.println("Buffer as a string");
		System.out.println(f.toString());
		System.out.println("Into Array");
		byte [] b= f.toByteArray();
		
		for(int i=0;i<b.length;i++)
			System.out.print((char)b[i]);
		
		
		System.out.println("Doing a reset");
		f.reset();
		
		for(int i=0;i<3;i++)
			f.write('X');
		
		System.out.println(f.toString());
	}

}

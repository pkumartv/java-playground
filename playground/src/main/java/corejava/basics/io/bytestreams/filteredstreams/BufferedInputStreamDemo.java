package corejava.basics.io.bytestreams.filteredstreams;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		String tmp = "This is a &copy; copyright symbol" + "but this is &copy not.\n";
		byte[] buf = tmp.getBytes();
		int c;
		boolean marked=false;

		ByteArrayInputStream in = new ByteArrayInputStream(buf);

		try (BufferedInputStream f= new BufferedInputStream(in);)
		{
			while((c=f.read())!=-1) {
				switch (c) {
				case '&':
					if(!marked) {
						f.mark(32);
						marked=true;
					}
					else
						marked=false;
					
					break;
				case ';':
					if(marked) {
						marked=false;
						System.out.print("(c)");
					}
					else
						System.out.print((char)c);
					
					break;

				case ' ':
					if(marked) {
						marked=false;
						f.reset();
						System.out.print("&");
					}
					else
						System.out.print((char)c);
					break;
					

				default:
					if(!marked) {
						System.out.print((char)c);
					}
					break;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

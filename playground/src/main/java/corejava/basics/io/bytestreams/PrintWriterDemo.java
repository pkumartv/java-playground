package corejava.basics.io.bytestreams;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw=  new PrintWriter(System.out,true);
		pw.println("This is being written through print writer!!");
		int i=0;
		pw.println(i);

		double d=4.5e-7;
		pw.println(d);
		pw.write("Hello");
		pw.println();
	}

}

package corejava.basics.io.bytestreams.bytearray;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		String tmp = "adasdsddsfdesdzfgbehdfgahszeahgsfdaezd";
		byte [] buf= tmp.getBytes();
		
		ByteArrayInputStream b1= new ByteArrayInputStream(buf);
		ByteArrayInputStream b2= new ByteArrayInputStream(buf, 0, 3);
		

	}

}

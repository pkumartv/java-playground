package corejava.basics.io.bytestreams;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console con;
		String str;
		
		con=System.console();
		if(con ==null) return;
		
		str=con .readLine("Enter a string:\n");
		con.printf("Heres the string you entered:: %s \n", str);

	}

}

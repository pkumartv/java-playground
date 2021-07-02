package corejava.interviews.simple;

import java.util.Iterator;

public class AllocationTest {

	public static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String s=null;;
		//s.isEmpty();
		System.out.println( "ok"+ "null".equals(s));
		int size=0;
		System.out.println("Total available bytes is "+ (size=1024));
		System.out.println(size);
		
		
		
		Integer a = 1000, b =1000;
		Integer c = 100, d = 100;
//		System.out.println(a == b);
//		System.out.println(c ==d);
//		
		
//		falsetrue
//
//		Yep the first output is produced for comparing reference; 'a' and 'b' - these are two different reference. In point 1, actually two references are created which is similar as -
//
//		Integer a = new Integer(1000);Integer b = new Integer(1000);
//
//		The second output is produced because the JVM tries to save memory, when the Integer falls in a range (from -128 to 127). At point 2 no new reference of type Integer is created for 'd'. Instead of creating new object for the Integer type reference variable 'd', it only assigned with previously created object referenced by 'c'. All of these are done by JVM.
//
//		These memory saving rules are not only for Integer. for memory saving purpose, two instances of the following wrapper objects (while created through boxing), will always be == where their primitive values are the same:
//		- Boolean
//		- Byte
//		- Character from \u0000 to \u007f (7f is 127 in decimal)
//		- Short and Integer from -128 to 127
//		Integera =1000,b= 1000;  //1

		System.out.println(a==b);
		
		



//		Integer c = 100, d = 100;  //2

		System.out.println(c==d);
		
		
		String x = "Java";
		x.concat(" Rules!");
		System.out.println("x = " + x); // the output is: x = Java
		//Now let's add
		x.toUpperCase();
		System.out.println("x = " + x); // the output is still:
	}
		

}

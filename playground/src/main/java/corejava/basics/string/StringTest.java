package corejava.basics.string;

public class StringTest {

	public static void main(String[] args) {
		String test = new String();
		char charArr[]= {'a','b','c','d','e','f'};
		String test1 = new String(charArr);
		String test2= new String(charArr,2,3);
		
		byte bytes[]= {65,66,67,68,69,90};
		
		String strFromBytes= new String(bytes);
		
		System.out.println(strFromBytes);
		System.out.println();
		
		//String literal
		String stringLiteral="abc";
		System.out.println("abc".length());
//		"abc".
		
		//String concatenation
		String age="9";
		String s= "He is"+age+ "years old";
		
		String longStr="This is a very long text"+
		"..contd very very long text";
		
		
		
		String four="four:" + 2+2;
		System.out.println(four);
		
		//toString method
		
		char ch;
		ch ="abc".charAt(1);
		System.out.println(ch);
		
		//getChars and getBytes
		
		//String to char array through toCharArray
		
		//String comparison 
		//equals and equalsIgnoreCase()
		
		
		//trim and strip methods
		
		//valueOf()
		
		
		//JDK8 Joining Strings
		
		
		
		//String Buffer synchornized and hence thread safe
		
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println("Buffer ="+sb);
		System.out.println("length ="+sb.length());
		System.out.println("capacity ="+sb.capacity());
		
		//Prints as room for 16 additional characters is alloted
//		Buffer =Hello
//		length =5
//		capacity =21
		
		
		
		//String Builder is not synchronized and hence faster
		
	}

}

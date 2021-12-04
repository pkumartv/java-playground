package corejava.basics.confusing;

public class Test {
	
	
	static boolean isOdd(int x){
		//System.out.println(x%2);
		return ((x%2)!=0);
	}

	static void objectTest(){
		String test= "StringTest";
		Object obj=test;

		if("StringTest".equals(obj))
		 System.out.println("Hello");
		 else
		 System.out.println("No Hello");
	}

	
	public static void main(String[] args) {
		objectTest();
		
		// boolean x=isOdd(-127);
		// System.out.println(x);
		// Integer a = 100, b =100;
		// Integer c = 1000, d = 1000;
		// System.out.println(a == b);
		// System.out.println(c ==d);
		// char [] xx =null;
		// doSomething(xx);
		
		// Integer no=null;
		// doSomething(no);
		
		// Object obj=null;
		// 		doSomething(obj);
				
		// 		doSomething((Integer)null);
	}
	
	
	public static void doSomething(Object obj) {
	System.out.println("Object called");}

		public static void doSomething(char[] obj) {
	System.out.println("Array called");}

		public static void doSomething(Integer obj) {
	System.out.println("Integer called");}

//Given two jars with 5 and 3 litres how will you get 2 litres
//	5 3 =4
//			5 0
//			2 3			3 0
//			--0 2			
//			5 2
//			--4 3
}

package corejava.basics.exceptions;

public class ThrowDemo {
	
	private static void demoproc() {
		try {
			throw new NullPointerException("DEMO");
		} catch (Exception e) {
			System.out.println("Caught inside demoproc");
			throw e;
		}
		

	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (Exception e) {
			System.out.println("Finally caught it");
		}
		 

	}

}

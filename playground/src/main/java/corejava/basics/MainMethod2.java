package corejava.basics;

public class MainMethod2 {
	
	public static void main(String[] args) {
		MainMethod mm = new MainMethod();
		mm= null;
		MainMethod.main(args);
		System.gc();
	}

}

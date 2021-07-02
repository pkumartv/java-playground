package corejava.varargs;

public class VarArgsDemo {

	// The right way to use varargs to pass one or more arguments
	static int min(int firstArg, int... remainingArgs) {
		int min = firstArg;
		for (int arg : remainingArgs)
			if (arg < min)
				min = arg;
		return min;
	}

	// Excerpt From: Joshua Bloch. “Effective Java”. Apple Books.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(min(10,5,6,8,0));
		//min(10,5,6,8,0);

	}

}

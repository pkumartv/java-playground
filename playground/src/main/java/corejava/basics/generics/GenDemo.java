package corejava.basics.generics;

class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);

		iOb.showType();

		int v = iOb.getOb();

		System.out.println(v);

		Gen<String> strOb = new Gen<String>("Pavan Genetic");

		strOb.showType();

		String ok = strOb.getOb();
		System.out.println(ok);
		
		Integer x=5,y=7;
		x.com

	}

}

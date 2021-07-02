package corejava.basics.confusing.staticaccess;

public class Bark {
	public static void main(String[] args) {

		Dog dogx = new Dog();
		Dog dogy = new Palmerian();
		dogx.bark();
		dogy.bark();
	}
}

class Dog {
	public static void bark() {
		System.out.println("Bow Bow");
	}
}

class Palmerian extends Dog {
	public static void bark() {
		System.out.println("Woof Woof");
	}
}

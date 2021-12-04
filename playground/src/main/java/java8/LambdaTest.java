package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class LambdaTest {

	public static void main(String[] args) {

		List myList = new ArrayList<String>();
		myList.add("Pavan");
		myList.add("Kiran");

		myList.forEach(x -> System.out.println(x));

		myList.forEach(x -> {
			if (x.equals("Pavan"))
				System.out.println(x);
		});

		// Runnable Test
		Runnable runnable = () -> System.out.println("I am running");
		runnable.run();

		Callable<String> callable = () -> {
			System.out.println("I am callable");
			return "ok";
		};
		try {
			callable.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

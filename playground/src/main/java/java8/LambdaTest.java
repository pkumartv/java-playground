package java8;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		List myList= new ArrayList<String>();
		myList.add("Pavan");
		myList.add("Kiran");
		
		myList.forEach(x -> System.out.println(x));
		
		myList.forEach(x -> { if(x.equals("Pavan")) System.out.println(x); });
	}

}

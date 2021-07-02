package java8.collections.iterators;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		//Creates an  array list for doubles
		ArrayList<Double> vals= new ArrayList<>();
		vals.add(10.01);
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		
		//using tryAdvance
		System.out.println("Contents of vals:\n");
		Spliterator<Double> splitr=vals.spliterator();
		while(splitr.tryAdvance( (n) -> System.out.println(n)));
		System.out.println();
		
		//create a new list that contains squares
		splitr= vals.spliterator();
		ArrayList<Double> sqrs= new ArrayList<>();
		while(splitr.tryAdvance((n)->sqrs.add(Math.sqrt(n)) ));
		//use forEachRemaining() to display contents  of sqrs;
		System.out.println("Contents of sqrs:");
		
		splitr=sqrs.spliterator();
		splitr.forEachRemaining((n)->System.out.println(n) );
		System.out.println();
		
		

	}

}

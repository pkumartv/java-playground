package java8.collections.comparator;

import java.util.Comparator;
import java.util.TreeSet;


class MyCompNatural implements Comparator<String> {

	@Override
	
	//Natural Order
	public int compare(String o1, String o2) {
		// reverse the comparison
		return o1.compareTo(o2);
	}

}

class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// reverse the comparison
		return o2.compareTo(o1);
	}

}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyComp());
		// FORM1: add elements to tree set
		ts.add("A");
		ts.add("B");
		ts.add("C");
		
		for (String element : ts) {
			System.out.println(element);
		}
		
		System.out.println();
		MyCompNatural mcNat= new MyCompNatural();
		ts = new TreeSet<String>(mcNat.reversed());

		// FORM2: add elements to tree set
		ts.add("A");
		ts.add("B");
		ts.add("C");
				
		for (String element : ts) {
			System.out.println(element);
		}
		
		//FORM3: 
		Comparator<String> mcLambda=(aStr,bStr) -> aStr.compareTo(bStr);
		ts = new TreeSet<String>(mcLambda);

		// FORM2: add elements to tree set
		ts.add("A");
		ts.add("B");
		ts.add("C");
		System.out.println("\nForm3 with lambda expressions");		
		for (String element : ts) {
			System.out.println(element);
		}
		
		//FORM4: Pass a reverse comparator to TreeSet() via lambda expr.
		TreeSet<String> treeSet= new TreeSet<String>
				(
				
						(aStr,bStr) -> bStr.compareTo(aStr)
				
				);

		//FORM5: Multiple comparator using thenComparing
		//TODO:PK advance comparator in lambda using thenComparing
//		treeSet= new TreeSet<String>
//				(
//						{
//						(aStr,bStr) -> bStr.compareTo(aStr)
//						}
//				
//				);
	}
}

package corejava.basics.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		//Create and initialize an linked list
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		
		//Create a reverse order comparator
		Comparator<Integer> r=Collections.reverseOrder();
		
		//Sort list by using the comparator
		Collections.sort(ll,r);
		
		System.out.println("List sorted in reverse:");
		for(int i:ll) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//Shuffle List
		Collections.shuffle(ll);
		
		//Display randomized list
		System.out.println("List shuffled is: ");
		for(int i:ll) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("Maximum: "+Collections.max(ll));
		System.out.println("Manimum: "+Collections.min(ll));
		
		
		

	}

}

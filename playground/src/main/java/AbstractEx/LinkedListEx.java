package AbstractEx;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;

public class LinkedListEx {
	
	class Node{
		int nodeValue;
		Node next;
	}
	

	public static void main(String[] args) {
		
		String [] arrString = new String[10];
		List<String> mm= new ArrayList<String>(100);
//		/arrString.length;
		//arrString.length
		Iterator<String> ok=mm.iterator();
		mm.contains("Pavan");
		ListIterator<String> listIterator=mm.listIterator();
		//listIterator.
		Collections.synchronizedList(mm);
		
		
		///LinkedList
		LinkedList<String> ll= new LinkedList<String>();
		//ll.con
		Queue<String> myQ= new LinkedList<String>();
		//myQ.o
		ArrayDeque<String> ad= new ArrayDeque<String>();
		
		
		Set<String> set = new HashSet<String>();
	}
	
	

}


class MyComparator implements Comparator<LinkedListEx>{

	@Override
	public int compare(LinkedListEx arg0, LinkedListEx arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
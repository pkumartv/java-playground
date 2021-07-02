//Use a comparator to sort accounts by last name
package java8.collections.comparator;
//Use a comparator to sort accounts by last name

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



//Compare last whole words in two Strings
class TComp  implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int i,j,k;
		
		
	//Find the index of beginning of last name
		i=o1.lastIndexOf(" ");
		j=o2.lastIndexOf(" ");
		
		k=o1.substring(i).compareToIgnoreCase(o2.substring(j));
		if(k==0) 
			//last names match check entire name
			return o1.compareTo(o2);
		else
			return k;
	}
	
}

public class TreeMapDemo2 {
	
	public static void main(String[] args) {
		//Create a tree map
		TreeMap<String,Double> tm = new TreeMap<String,Double>(new TComp());
		
		//Put elements to the map
		tm.put("John Doe", 3434.34);
		tm.put("Tom Smith", 123.22);
		tm.put("Jane Baker", 1378.00);
		tm.put("Tod Hall", 99.22);
		tm.put("Ralph Smith", -19.08);
		
		//Get a set of entries
		Set<Map.Entry<String,Double>> set=tm.entrySet();
		
		//Display the elements
		for(Map.Entry<String, Double> me: set) {
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		//Deposit  1000 into John Doe's account
		double balance= tm.get("John Doe");
		tm.put("John Doe", balance+1000);
		
		System.out.println("John Doe's new balance: "+tm.get("John Doe"));
		
	}

}

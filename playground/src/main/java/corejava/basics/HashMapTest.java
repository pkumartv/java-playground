package corejava.basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	private static Map<String,String> myMap;
	public HashMapTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		myMap = new HashMap<String,String>();
		myMap.put("Pavan", "JAVA");
		//myMap.
		
		//System.out.println(myMap);
		for(Map.Entry<String, String> entry: myMap.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}

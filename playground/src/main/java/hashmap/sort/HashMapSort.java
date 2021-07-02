package hashmap.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSort {
	
	public static void main(String[] args) {
		
		Map<String,Integer> unSortedMap = new HashMap<String,Integer>();
		unSortedMap.put("Pavan", 10);
		unSortedMap.put("Kiran", 5);
		unSortedMap.put("Shravsi", 1);
		
		
        List<Map.Entry<String, Integer> > list = 
                new LinkedList<Map.Entry<String, Integer> >(unSortedMap.entrySet()); 
   
         // Sort the list 
         Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
             public int compare(Map.Entry<String, Integer> o1,  
                                Map.Entry<String, Integer> o2) 
             { 
                 return (o1.getValue()).compareTo(o2.getValue()); 
             } 
         }); 
           
         // put data from sorted list to hashmap  
         HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
         for (Map.Entry<String, Integer> aa : list) { 
             temp.put(aa.getKey(), aa.getValue()); 
         }
         System.out.println(unSortedMap);
//		//List<Entry<String,Integer>> sort= new Lin
//		Map<String,Integer> toSort= new TreeMap<String,Integer>();
//		for(Map.Entry<String, Integer> entry: unSortedMap.entrySet()){
//			toSort.put(entry.getKey(), entry.getValue());
//			
//		}
//		
//		System.out.println(unSortedMap);
//		for(Map.Entry<String, Integer> entry: unSortedMap.entrySet()){
//			System.out.println("Map  "+entry);
//			
//		}
		System.out.println(temp);
	}

}

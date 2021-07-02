package corejava.executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GQLTest {
	
	String myx;
	public GQLTest(){
		//System.out.println("ok");
	}
	
	public GQLTest(String x){
		//System.out.println("ok");
		this.myx=x;
	}
		
	public  String start(){
		return "GQLTEST "+myx;
	}
	
	public static void main(String[] args) {
		List<Integer> xz= Arrays.asList(2,3,4,5,6);
		List<?> subset= xz.stream().map(a -> a * 2).collect(Collectors.toList());
		System.out.println(subset);
		
		
		// create a list of integers 
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  
	    // collect method returns a set 
	    Set<Integer> squareSet = 
	         numbers.stream().map(x -> x*x).collect(Collectors.toSet()); 
	    System.out.println(squareSet); 
	}
	
	

}

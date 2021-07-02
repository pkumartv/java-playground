package corejava.basics.typewrappers;

public class MemoryDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1,mem2;
		Integer someints[]=  new Integer[1000];
		//System.out.println(someints);
		System.out.println("Total Memory is: "+ r.totalMemory());
		mem1=r.freeMemory();
		System.out.println("Initial free memory is "+mem1);
		r.gc();
		mem1=r.freeMemory();
		System.out.println("Free memory after gc is "+mem1);
		for(int i=0;i<1000;i++) {
			someints[i]= Integer.valueOf(i);
			
		}
		mem2=r.freeMemory();
		System.out.println("Free memory after allocation is"+mem2);
		System.out.println("memory used by allocation: "+ (mem1-mem2));
		
		//discard integers
		for(int i=0;i<1000;i++)
			someints[i]=null;
		
		r.gc();
		
		mem2=r.freeMemory();
		System.out.println("Free memory after collecting discarding Integers"+mem2);
		
		
		//System.out.println("Runtime version is "+Runtime.getRuntime().);
		
		
	}

}

package dp.singleton;

public class SingletonTextEx {
	
	private static volatile SingletonTextEx singleton;
	private SingletonTextEx(){
		
	}
	//copy constructor
	// equals
	//clone 
	private SingletonTextEx(SingletonTextEx x){
		System.out.println("Constructor");
	
	}
	
	public static SingletonTextEx getInstance(){
		
		if(singleton==null){
			synchronized(SingletonTextEx.class)
			{
				if(singleton==null)
					singleton = new SingletonTextEx();
			}
		}
		
		return singleton;
	}
	

	//Better implementation would be 
	// Although the Singleton pattern was introduced by GoF,
	// the original implementation is known to be problematic in multithreaded scenarios.
    // So here, we're going to follow a more optimal approach that makes use of a static inner class:
	//Check SingletoneBetter class
	


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Hello ");
		return super.clone();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public static void main(String[] args) {
		SingletonTextEx test=SingletonTextEx.getInstance();
		SingletonTextEx test1=test;
		System.out.println(test1);
		
	}
}

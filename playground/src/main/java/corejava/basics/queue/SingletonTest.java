package corejava.basics.queue;

public class SingletonTest{
	
	private static volatile SingletonTest instance;

	private SingletonTest(){

	}

	public SingletonTest getInstance(){

		if(instance==null){
			synchronized(SingletonTest.class){
			 instance= new SingletonTest();
			 return instance;
			}
		}
		else 
		return instance;
	}
}
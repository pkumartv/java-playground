package Threads;

public class SingletonTest{
	
	private static SingletonTest instance;
	//TODO:PK check for double locked and also volatile

	private SingletonTest(){

	}

	public SingletonTest getInstance(){

		if(instance==null){
			synchronized(SingletonTest.class)
			{
			 instance= new SingletonTest();
			 return instance;
			}
		}
		else 
		return instance;
	}
}
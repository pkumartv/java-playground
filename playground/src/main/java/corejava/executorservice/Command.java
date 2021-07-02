package corejava.executorservice;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class Command implements Callable {
	
	String in;
	Command(String in){
		this.in=in;
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		return new GQLTest(in);
	}

}

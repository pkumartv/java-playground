package corejava.basics.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueEx {
	
	public static void main(String[] args) {
		BlockingQueue<String> bq= new LinkedBlockingQueue<String>();
		bq.add("Pavan");
		System.out.println(bq.contains("Pavan"));
		
		
		System.out.println(bq);
	}

}

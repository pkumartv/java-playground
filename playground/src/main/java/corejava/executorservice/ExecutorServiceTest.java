package corejava.executorservice;
 
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
 
public class ExecutorServiceTest {
 
 public static void main(String[] args) throws InterruptedException, ExecutionException {
	 
	 ExecutorService executor = Executors.newFixedThreadPool(5);
	 List<Future<GQLTest>> futures = new ArrayList<Future<GQLTest>>();
	 for(Integer i=0;i<10;i++){
		 Command cmd = new Command(i.toString());
		 futures.add(executor.submit(cmd));
	 }
	System.out.println("Hi");
	ListIterator<Future<GQLTest>> iter= futures.listIterator();
	while(iter.hasNext()){
		
		try {
			Future<GQLTest> obj=iter.next();
			GQLTest obj2 = obj.get();
			System.out.println(obj2.start());
			//String ok=(String) obj.get().start();
			
			//System.out.println(ok.start());
			//gg.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}
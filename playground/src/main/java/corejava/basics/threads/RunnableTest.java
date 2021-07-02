package corejava.basics.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
			System.out.println("Run in RunnableTest");
	}

	public static void main(String[] args) {
		System.out.println(" Inside : " + Thread.currentThread().getName());
		System.out.println("creating ExecutorService");
		//Thread myThread= new Thread(new RunnableTest());
		//myThread.start();
		ExecutorService executorservice= Executors.newSingleThreadExecutor();
		System.out.println("creating a runnable");
//		Runnable runnable = () -> {
//			System.out.println("inside: "+ Thread.currentThread().getName());
//			};
//			System.out.println("submit the task specified by the runnable to the executorservice");
//			executorservice.submit(runnable);
//			}
		executorservice.execute(new Runnable(){
			public void run(){
			System.out.println("asynchronous task");
			}
			});
			executorservice.shutdown();
	}
}

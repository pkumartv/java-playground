package Threads;

public class ThreadTest {

	@SuppressWarnings("unused")
	private void thread() {
		// TODO Auto-generated method stub
		new Runnable() {
			public void run() {

			}
		};

	}

	public static void main(String[] args) {
		Thread myThread= new Thread();
		myThread.run();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());

		System.gc();
		Runtime.getRuntime().freeMemory();



		

	}
}

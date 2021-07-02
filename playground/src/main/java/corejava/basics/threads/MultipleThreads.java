package corejava.basics.threads;
//Implements Runnable Interface

class NewThread3 implements Runnable {
	Thread t;

	NewThread3(String threadName) {
		// create a new, second thread
		t = new Thread(this, threadName);
		System.out.println("Child Thread" + t);

	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println("Child Thread" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Child Thread interrupted");
				e.printStackTrace();
			}
		}
		System.out.println("Exiting child thread");

	}
}

public class MultipleThreads {

	public static void main(String[] args) {
		NewThread3 nt1 = new NewThread3("One");
		NewThread3 nt2 = new NewThread3("Two");
		NewThread3 nt3 = new NewThread3("Three");
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		System.out.println("Thread " + nt1.t.getName() + " status is " + nt1.t.isAlive());
		System.out.println("Thread " + nt2.t.getName() + " status is " + nt2.t.isAlive());
		System.out.println("Thread " + nt3.t.getName() + " status is " + nt3.t.isAlive());
		try {

			// Thread.sleep(1000);
			// Use join to wait for child threads to finish
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();

		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
			e.printStackTrace();

		}

		System.out.println("Thread " + nt1.t.getName() + " status is " + nt1.t.isAlive());
		System.out.println("Thread " + nt2.t.getName() + " status is " + nt2.t.isAlive());
		System.out.println("Thread " + nt3.t.getName() + " status is " + nt3.t.isAlive());

		System.out.println("Main Thread Exiting");

	}

}

package corejava.basics.threads;
//Implements Runnable Interface

class NewThread implements Runnable{
	Thread t;
	NewThread(){
		//create a new, second thread
		t= new Thread(this,"Demo Thread");
		System.out.println("Child Thread"+t);
		
	}
	@Override
	public void run() {
		for(int i=5;i>0;i--) {
			System.out.println("Child Thread"+i);
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
public class ThreadDemo {

	public static void main(String[] args) {
		NewThread nt= new NewThread();
		nt.t.start();
		
		for(int i=5;i>0;i--) {
			System.out.println("Main Thread"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Main Thread interrupted");
				e.printStackTrace();
				
			}
		}
		System.out.println("Main Thread Exiting");

	}

}

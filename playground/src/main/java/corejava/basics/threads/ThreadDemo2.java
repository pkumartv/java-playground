package corejava.basics.threads;

//Extends Thread Class

class NewThread2 extends Thread{
	//Thread t;
	NewThread2(){
		//create a new, second thread
		super("Demo Thread");
		System.out.println("Child Thread"+this);
		
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
public class ThreadDemo2 {

	public static void main(String[] args) {
		NewThread2 nt= new NewThread2();
		nt.start();
		
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

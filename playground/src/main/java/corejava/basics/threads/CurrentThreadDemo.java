package corejava.basics.threads;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("Current thread is "+t);
		
		t.setName("My Thread");
		System.out.println("Current thread is "+t);
		
		for(int i=5;i>0;i--) {
			System.out.println(i);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

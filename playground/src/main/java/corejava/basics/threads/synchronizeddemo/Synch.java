package corejava.basics.threads.synchronizeddemo;

class Callme{
	 void call(String msg) {
	  //FORM1: using synchronized methods
	  //synchronized void call(String msg) {
		System.out.print("["+msg);
		try {
			//Induces race condition
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("]");
		

	}
}

class Caller implements Runnable{
	String msg;
	Callme target;
	Thread t;
	
	public Caller(Callme callme,String s) {
		target= callme;
		msg=s;
		t= new Thread(this);
	}

	@Override
	//FORM2: using synchronized block
	public void run() {
		//synchronized (target)
		synchronized (Callme.class)
		{
			target.call(msg);	
		}
		
		
	}
	
}

public class Synch {

	public static void main(String[] args) {
		Callme callme = new Callme();
		Caller ob1= new Caller(callme,"Hello");
		Caller ob2= new Caller(callme,"Synchronized");
		Caller ob3= new Caller(callme,"World");
		
		//Start the threads
		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		
		try {
			ob1.t.join();

		ob2.t.join();
		ob3.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

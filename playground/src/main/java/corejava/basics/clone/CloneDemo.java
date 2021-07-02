package corejava.basics.clone;

public class CloneDemo {

	public static void main(String[] args) {
		TestClone t= new TestClone();
		t.a=20;
		t.d=45.675;
		
		try {
			TestClone newclone= (TestClone) t.clone();
			System.out.println("ORIG "+t.a+" "+t.d);
			System.out.println("NEWCLONE IS "+newclone.a+" "+newclone.d);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

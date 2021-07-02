package corejava.basics;

public class ObjectTest {
	
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("ObjectTest finalize");
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//System.out.println("hashcode"+super.hashCode());
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ObjectTest toString";
	}

	public ObjectTest() {
		//String okArr[] =new String[5];
		//super();
		//HelloWorld.main(new String[1]);
		// TODO Auto-generated constructor stub
		System.out.println("ObjectTest Constructor");
	}
	
	

}

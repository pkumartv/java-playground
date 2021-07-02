package corejava.basics.clone;

public class TestClone implements Cloneable {

	int a;
	double d;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (TestClone)super.clone();
	}
	
	public TestClone cloneTest() {
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cloning not supported");
			return this;
		}
		//return null;
	}

}


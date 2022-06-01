package corejava.basics;

import InterfaceEx.ImplementInterface;

public class HelloWorld {

	static{
		System.out.println("BEFORE");
	}

	public static void main(String ...args){
		System.out.println("Hello Pavan!!!");
		//ObjectTest ot= new ObjectTest();
		ImplementInterface ot= new ImplementInterface();
		System.out.println("toString for ObjectTest prints:: "+ot);
		System.out.println("hashCode for ObjectTest is "+ot.hashCode());
		ot=null;

		//HelloWorld test=new HelloWorld();
		//test=null;
		System.gc();
		//Runtime.getRuntime().gc();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Destructor");
	}

}

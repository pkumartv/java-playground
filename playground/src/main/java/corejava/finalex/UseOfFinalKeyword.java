package corejava.finalex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class A
{
    int i; 
    boolean b;//Non-final global variable, no need to initialize them
    float f;
    double d;
    Boolean B;
    String test;
    List emptyOne;
 
    final int j;         //Blank Final Field
 
    A()
    {
        j=20;    
 
        //final global variable must get a value at the time of object creation.
    }

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		A a= (A)obj;
		return this.j==a.j;
		//return super.equals(arg0);
	}
    
}
 
public class UseOfFinalKeyword
{
    public static void main(String[] args)
    {
        A a = new A();
        A b= new A();
        System.out.println(a.equals(b));
//        System.out.println("NICE"+ a.i+ a.test+ a.emptyOne+ a.b+ a.B+ a.f+a.d);
//        List<String> myList= new ArrayList<String>();
//        myList.add("Pavan");
//        myList.add("Kiran");
//        
//        Iterator<String> iter= myList.iterator();
//        while(iter.hasNext()){
//        	Object obj=iter.next();
//        	System.out.println(obj);
//        	myList.add("PP");
//        	
//        }
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return 1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
    
}
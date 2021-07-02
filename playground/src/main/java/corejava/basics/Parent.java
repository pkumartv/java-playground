package corejava.basics;

import java.io.Serializable;

class Parent implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5114265079596371224L;
	private String pString="Pavan";

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent parent= new Parent();
		Parent parent= new Child();
		System.out.println(parent.pString);
		//parent.
		//parent.childMethod();

	}


}

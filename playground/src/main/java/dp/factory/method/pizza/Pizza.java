package dp.factory.method.pizza;

import java.util.ArrayList;

//import javafx.scene.shape.Box;

public abstract class Pizza {
	String name,dough,sauce;
	
	ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public  void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing"+ name);
		System.out.println("Tossing dough...");
		System.out.println("Adding Sauce");
		System.out.println("Adding Toppings");
		for (String topping: toppings) {
			System.out.println("  "+ topping);
			
		}
		
	}
	
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 25mins at 350");
	}
	
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Curring the Pizza into diagonal sizes");
	}
	
	 public void box() {
		// TODO Auto-generated method stub
		System.out.println("Place pizza in official pizza store box");
	}
	

}

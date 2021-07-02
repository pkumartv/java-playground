package dp.factory.method.pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name="Chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomato Sauce";
		
		toppings.add("Shredded  Mozzarella Cheese");
	}
	
	public void cut(){
		System.out.println("Cutting the Pizza into Square Slices");
	}
}

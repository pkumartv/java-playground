package dp.factory.method.pizzastore;

import dp.factory.method.pizza.Pizza;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore= new NYPizzaStore();
		Pizza pizza= nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered pizza"+pizza.getName());
	}

}

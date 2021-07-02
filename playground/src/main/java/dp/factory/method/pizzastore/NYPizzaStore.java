package dp.factory.method.pizzastore;

import dp.factory.method.pizza.NYStyleCheesePizza;
import dp.factory.method.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		if("cheese".equals(type)){
			return new NYStyleCheesePizza();
		}
		return null;
	}

}

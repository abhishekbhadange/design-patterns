package factoryMethodPattern.creator;

import factoryMethodPattern.product.NYStyleCheesePizza;
import factoryMethodPattern.product.NYStyleVeggiePizza;
import factoryMethodPattern.product.Pizza;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new NYStyleCheesePizza();
		else if(type.equals("veggie"))
			return new NYStyleVeggiePizza();
		else
			return null;
	}
}

package factoryMethodPattern.creator;

import factoryMethodPattern.product.ChicagoStyleCheesePizza;
import factoryMethodPattern.product.ChicagoStyleVeggiePizza;
import factoryMethodPattern.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String type) {
		if(type.equals("cheese"))
			return new ChicagoStyleCheesePizza();
		else if(type.equals("veggie"))
			return new ChicagoStyleVeggiePizza();
		else
			return null;
	}
}

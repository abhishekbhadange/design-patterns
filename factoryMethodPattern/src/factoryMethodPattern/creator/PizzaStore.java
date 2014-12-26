package factoryMethodPattern.creator;

import factoryMethodPattern.product.Pizza;

public abstract class PizzaStore {
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String type);
}

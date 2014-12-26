package factoryMethodPattern.driver;

import factoryMethodPattern.creator.ChicagoPizzaStore;
import factoryMethodPattern.creator.NYPizzaStore;
import factoryMethodPattern.creator.PizzaStore;
import factoryMethodPattern.product.Pizza;

public class Driver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}

package abstractFactoryPattern.driver;

import abstractFactoryPattern.client.Pizza;
import abstractFactoryPattern.creator.ChicagoPizzaStore;
import abstractFactoryPattern.creator.NYPizzaStore;
import abstractFactoryPattern.creator.PizzaStore;

public class Driver {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");
	}
}

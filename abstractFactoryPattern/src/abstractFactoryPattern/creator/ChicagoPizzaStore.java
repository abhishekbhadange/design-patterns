package abstractFactoryPattern.creator;

import abstractFactoryPattern.client.CheesePizza;
import abstractFactoryPattern.client.ClamPizza;
import abstractFactoryPattern.client.PepperoniPizza;
import abstractFactoryPattern.client.Pizza;
import abstractFactoryPattern.client.VeggiePizza;
import abstractFactoryPattern.factory.ChicagoPizzaIngredientFactory;
import abstractFactoryPattern.factory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} 
		else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		} 
		else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} 
		else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		return pizza;
	}
}

package abstractFactoryPattern.creator;

import abstractFactoryPattern.client.CheesePizza;
import abstractFactoryPattern.client.ClamPizza;
import abstractFactoryPattern.client.PepperoniPizza;
import abstractFactoryPattern.client.Pizza;
import abstractFactoryPattern.client.VeggiePizza;
import abstractFactoryPattern.factory.NYPizzaIngredientFactory;
import abstractFactoryPattern.factory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
		else if(item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		}
		else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		else if(item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}
}

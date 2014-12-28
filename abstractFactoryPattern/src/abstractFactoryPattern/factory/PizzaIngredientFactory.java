package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.Cheese;
import abstractFactoryPattern.product.Clams;
import abstractFactoryPattern.product.Dough;
import abstractFactoryPattern.product.Pepperoni;
import abstractFactoryPattern.product.Sauce;
import abstractFactoryPattern.product.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}

package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.Cheese;
import abstractFactoryPattern.product.Clams;
import abstractFactoryPattern.product.Dough;
import abstractFactoryPattern.product.FreshClams;
import abstractFactoryPattern.product.Garlic;
import abstractFactoryPattern.product.MarinaraSauce;
import abstractFactoryPattern.product.Mushroom;
import abstractFactoryPattern.product.Onion;
import abstractFactoryPattern.product.Pepperoni;
import abstractFactoryPattern.product.RedPepper;
import abstractFactoryPattern.product.ReggianoCheese;
import abstractFactoryPattern.product.Sauce;
import abstractFactoryPattern.product.SlicedPepperoni;
import abstractFactoryPattern.product.ThinCrustDough;
import abstractFactoryPattern.product.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClam() {
		return new FreshClams();
	}
}

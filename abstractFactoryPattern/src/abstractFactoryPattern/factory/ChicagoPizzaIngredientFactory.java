package abstractFactoryPattern.factory;

import abstractFactoryPattern.product.BlackOlives;
import abstractFactoryPattern.product.Cheese;
import abstractFactoryPattern.product.Clams;
import abstractFactoryPattern.product.Dough;
import abstractFactoryPattern.product.Eggplant;
import abstractFactoryPattern.product.FrozenClams;
import abstractFactoryPattern.product.MozzarellaCheese;
import abstractFactoryPattern.product.Pepperoni;
import abstractFactoryPattern.product.PlumTomatoSauce;
import abstractFactoryPattern.product.Sauce;
import abstractFactoryPattern.product.SlicedPepperoni;
import abstractFactoryPattern.product.Spinach;
import abstractFactoryPattern.product.ThickCrustDough;
import abstractFactoryPattern.product.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
	}
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClam() {
		return new FrozenClams();
	}
}

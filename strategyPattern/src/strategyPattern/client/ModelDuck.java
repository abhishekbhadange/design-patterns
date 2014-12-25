package strategyPattern.client;

import strategyPattern.algorithm.FlyNoWay;
import strategyPattern.algorithm.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	public void display() {
		System.out.println("I'm a model duck.");
	}
}

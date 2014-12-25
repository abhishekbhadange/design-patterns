package strategyPattern.client;

import strategyPattern.algorithm.FlyWithWings;
import strategyPattern.algorithm.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("I'm a real Mallard duck.");
	}
}

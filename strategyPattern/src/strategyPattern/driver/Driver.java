package strategyPattern.driver;

import strategyPattern.algorithm.FlyRocketPowered;
import strategyPattern.client.Duck;
import strategyPattern.client.MallardDuck;
import strategyPattern.client.ModelDuck;

public class Driver {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}

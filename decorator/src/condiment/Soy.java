package condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return .25 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
}

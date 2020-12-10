package condiment;

import beverage.Beverage;
import beverage.CondimentDecorator;

public class Whip extends CondimentDecorator {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
	
}

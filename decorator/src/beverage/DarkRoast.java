package beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super.setDescription("Dark Roast");
	}

	@Override
	public double cost() {
		return .99;
	}

}

package beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super.setDescription("House Blend");
	}

	@Override
	public double cost() {
		return .89;
	}

}

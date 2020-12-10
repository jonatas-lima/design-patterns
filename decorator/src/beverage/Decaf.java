package beverage;

public class Decaf extends Beverage {

	public Decaf() {
		super.setDescription("Decaf");
	}

	@Override
	public double cost() {
		return 1.05;
	}

}

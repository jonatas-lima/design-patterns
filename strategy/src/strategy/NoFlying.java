package strategy;

public class NoFlying implements FlyStrategy {

	@Override
	public void fly() {
		System.out.println("I can't fly :(");
	}

}

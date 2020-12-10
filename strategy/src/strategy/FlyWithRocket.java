package strategy;

public class FlyWithRocket implements FlyStrategy {

	@Override
	public void fly() {
		System.out.println("Flying with a rocket :)");
	}

}

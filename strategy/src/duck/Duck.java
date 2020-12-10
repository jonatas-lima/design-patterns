package duck;

import strategy.FlyStrategy;
import strategy.QuackStrategy;

public abstract class Duck {

	private FlyStrategy flyStrategy;
	private QuackStrategy quackStrategy;
	
	public Duck(FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
		this.flyStrategy = flyStrategy;
		this.quackStrategy = quackStrategy;
	}

	public void setFlyStrategy(FlyStrategy flyStrategy) {
		this.flyStrategy = flyStrategy;
	}

	public void setQuackStrategy(QuackStrategy quackStrategy) {
		this.quackStrategy = quackStrategy;
	}
	
	public void swim() {
		System.out.println("Swiming...");
	}

	public void quack() {
		quackStrategy.quack();
	}
	
	public void fly() {
		flyStrategy.fly();
	}
}

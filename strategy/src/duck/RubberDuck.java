package duck;

import strategy.NoFlying;
import strategy.SilentQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new NoFlying(), new SilentQuack());
	}

}

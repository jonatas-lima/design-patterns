package duck;

import strategy.NoFlying;
import strategy.SilentQuack;

public class WoodDuck extends Duck {

	public WoodDuck() {
		super(new NoFlying(), new SilentQuack());
	}

}

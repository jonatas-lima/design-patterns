package duck;

import strategy.FlyWithWings;
import strategy.QuackWithSpeaker;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(new FlyWithWings(), new QuackWithSpeaker());
	}

}

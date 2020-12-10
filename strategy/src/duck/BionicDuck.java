package duck;

import strategy.FlyWithRocket;
import strategy.QuackWithSpeaker;

public class BionicDuck extends Duck {

	public BionicDuck() {
		super(new FlyWithRocket(), new QuackWithSpeaker());
	}
}

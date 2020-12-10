package strategy;

public class QuackWithSpeaker implements QuackStrategy {

	@Override
	public void quack() {
		System.out.println("QUAAAACK!");
	}

}

package strategy;

public class SilentQuack implements QuackStrategy {

	@Override
	public void quack() {
		System.out.println("Silence...");
	}

}

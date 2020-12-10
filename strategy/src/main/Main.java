package main;

import duck.BionicDuck;
import duck.Duck;
import duck.MallardDuck;
import duck.RubberDuck;
import strategy.FlyWithRocket;

public class Main {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck woodDuck = new RubberDuck();
		Duck bionicDuck = new BionicDuck();
		
		System.out.print("Mallard flying: ");
		mallardDuck.fly();
		
		System.out.print("Wood duck flying: ");
		woodDuck.fly();
		
		System.out.print("Bionic flying: ");
		bionicDuck.fly();
		
		System.out.println();
		
		System.out.print("Mallard quacking: ");
		mallardDuck.quack();
		
		System.out.print("Wood duck quacking: ");
		woodDuck.quack();

		System.out.print("Bionic quacking: ");
		bionicDuck.quack();
		
		// o comportamento pode mudar em tempo de execução
		mallardDuck.setFlyStrategy(new FlyWithRocket());
		mallardDuck.fly();
	}

}

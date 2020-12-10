package main;

import duck.BionicDuck;
import duck.Duck;
import duck.MallardDuck;
import duck.WoodDuck;

public class Main {

	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Duck woodDuck = new WoodDuck();
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
	}

}

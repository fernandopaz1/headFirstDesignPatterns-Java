package c1_Intro_To_Design_Patterns.strategyPattern;

import c1_Intro_To_Design_Patterns.strategyPattern.ducks.Duck;
import c1_Intro_To_Design_Patterns.strategyPattern.ducks.MallardDuck;
import c1_Intro_To_Design_Patterns.strategyPattern.ducks.RedHeadDuck;
import c1_Intro_To_Design_Patterns.strategyPattern.ducks.RubberDuck;
import c1_Intro_To_Design_Patterns.strategyPattern.ducks.WoodenDuck;

public class Main {

	public static void main(String[] args) {
		demoDuck(new MallardDuck());
		demoDuck(new RedHeadDuck());
		demoDuck(new WoodenDuck());
		demoDuck(new RubberDuck());
	}

	public static void demoDuck(Duck duck) {
		System.out.println("\n".repeat(2) + "-".repeat(30));
		System.out.println("Demo de " + duck.getClass().getSimpleName());
		duck.performFly();
		duck.performQuack();
		duck.performSwim();
		duck.display();
	}
}

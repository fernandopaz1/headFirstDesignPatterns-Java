package c1_Intro_To_Design_Patterns.strategyPattern.ducks;

import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyWithWings;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack.Quack;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim.Swim;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		super();
		this.flyBehavior = new FlyWithWings();
		this.swimBeaBehavior = new Swim();
		this.quackBeahavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Looks like a redhead duck");

	}

}

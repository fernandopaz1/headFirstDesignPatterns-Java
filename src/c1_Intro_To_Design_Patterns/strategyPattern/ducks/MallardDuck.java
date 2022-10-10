package c1_Intro_To_Design_Patterns.strategyPattern.ducks;

import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyWithWings;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack.Quack;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim.Swim;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		this.flyBehavior = new FlyWithWings();
		this.quackBeahavior = new Quack();
		this.swimBeaBehavior = new Swim();
	}

	@Override
	public void display() {
		System.out.println("Looks like a mallard duck");
	}

}

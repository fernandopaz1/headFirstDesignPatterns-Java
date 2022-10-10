package c1_Intro_To_Design_Patterns.strategyPattern.ducks;

import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyNoWay;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyWithWings;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack.Squeack;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim.Swim;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		this.flyBehavior = new FlyNoWay();
		this.swimBeaBehavior = new Swim();
		this.quackBeahavior = new Squeack();
	}

	@Override
	public void display() {
		System.out.println("Looks like a rubber duck");

	}

}

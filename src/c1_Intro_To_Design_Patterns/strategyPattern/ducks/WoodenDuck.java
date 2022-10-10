package c1_Intro_To_Design_Patterns.strategyPattern.ducks;

import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyNoWay;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack.MuteQuack;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim.SwimNoWay;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		super();
		this.flyBehavior = new FlyNoWay();
		this.swimBeaBehavior = new SwimNoWay();
		this.quackBeahavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("looks like a wooden duck");
	}

}

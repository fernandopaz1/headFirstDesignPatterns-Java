package c1_Intro_To_Design_Patterns.strategyPattern.ducks;

import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly.FlyBehavior;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack.QuackBeahavior;
import c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim.SwimBehavior;

public abstract class Duck {
	
	public FlyBehavior flyBehavior;
	public SwimBehavior swimBeaBehavior;
	public QuackBeahavior quackBeahavior;

	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}	
	
	public void performSwim() {
		swimBeaBehavior.swim();
	}
	
	public void performQuack() {
		quackBeahavior.quack();
	}
}

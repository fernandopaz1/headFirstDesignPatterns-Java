package c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly");

	}

}

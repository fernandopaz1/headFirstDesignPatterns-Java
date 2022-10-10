package c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.fly;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}

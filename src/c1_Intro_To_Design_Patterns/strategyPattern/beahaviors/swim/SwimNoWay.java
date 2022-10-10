package c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.swim;

public class SwimNoWay implements SwimBehavior {

	@Override
	public void swim() {
		System.out.println("Can't Swim");

	}

}

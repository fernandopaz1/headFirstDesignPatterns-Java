package c1_Intro_To_Design_Patterns.strategyPattern.beahaviors.quack;

public class MuteQuack implements QuackBeahavior {

	@Override
	public void quack() {
		System.out.println("...");

	}

}

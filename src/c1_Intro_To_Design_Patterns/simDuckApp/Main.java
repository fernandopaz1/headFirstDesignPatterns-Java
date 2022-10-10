package c1_Intro_To_Design_Patterns.simDuckApp;

public class Main {

	public static void main(String[] args) {

		demoDuck(new RedheadDuck());
		demoDuck(new MallardDuck());

		demoDuck(new WoodenDuck());

	}

	public static void demoDuck(Duck duck) {
		System.out.println("\n".repeat(2) + "-".repeat(30));
		System.out.println("Demo de " + duck.getClass().getSimpleName());
		duck.swim();
		duck.quack();
		duck.display();
	}

}

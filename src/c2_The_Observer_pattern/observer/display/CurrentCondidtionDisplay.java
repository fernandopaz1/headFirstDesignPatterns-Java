package c2_The_Observer_pattern.observer.display;

import c2_The_Observer_pattern.observer.interfaces.Observer;
import lombok.Data;

@Data
public class CurrentCondidtionDisplay implements Observer, Display {

	private static final String CURRENT_CONDITION_MSG = "Tempreature %.2f -  Humidity %.2f - Pressure %.2f";

	@Override
	public void update(float temperature, float humidity, float pressure) {
		display(temperature, humidity, pressure);
	}

	@Override
	public void display(float temperature, float humidity, float pressure) {
		System.out.println("-".repeat(10) + "Current Display" + "-".repeat(10));
		System.out.println(String.format(CURRENT_CONDITION_MSG, temperature, humidity, humidity));
		System.out.println("-".repeat(30) + "\n");
	}

}

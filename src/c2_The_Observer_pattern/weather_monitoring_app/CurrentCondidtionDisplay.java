package c2_The_Observer_pattern.weather_monitoring_app;

import lombok.Data;

@Data
public class CurrentCondidtionDisplay implements Display {

	private static final String CURRENT_CONDITION_MSG = "Tempreature %.2f -  Humidity %.2f - Pressure %.2f";
	private float temperature;
	private float pressure;
	private float humidity;

	@Override
	public void display() {
		System.out.println("-".repeat(10) + "Current Display" + "-".repeat(10));
		System.out.println(String.format(CURRENT_CONDITION_MSG, this.getTemperature(),this.getHumidity(),this.getPressure()));
		System.out.println("-".repeat(30) + "\n");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.setTemperature(temperature);
		this.setPressure(pressure);
		this.setHumidity(humidity);
		display();
	}

}

package c2_The_Observer_pattern.weather_monitoring_app;

import lombok.Data;

@Data
public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;
	
	private Display currentConditionDisplay;
	private Display statisticsDisplay;
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		this.measurementsChanged();
	}
	
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		this.measurementsChanged();
	}
	
	public void setPressure(float pressure) {
		this.pressure = pressure;
		this.measurementsChanged();
	}
	
	
	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float presure = getPressure();
		
		currentConditionDisplay.update(temp, humidity, presure);
		statisticsDisplay.update(temp, humidity, presure);
	}
}

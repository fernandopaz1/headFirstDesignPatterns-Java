package c2_The_Observer_pattern.observer;

import java.util.ArrayList;
import java.util.List;

import c2_The_Observer_pattern.observer.interfaces.Observer;
import c2_The_Observer_pattern.observer.interfaces.Subject;
import lombok.Data;

@Data
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	private void measurementsChanged() {
		notifyObservers();
	}
	
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
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}

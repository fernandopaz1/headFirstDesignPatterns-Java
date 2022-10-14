package c2_The_Observer_pattern.observer;

import c2_The_Observer_pattern.observer.display.StatisticsDisplay;
import c2_The_Observer_pattern.observer.display.CurrentCondidtionDisplay;
import c2_The_Observer_pattern.observer.display.HeatIndexDisplay;

public class Main {

	public static void main(String[] args) {
		StatisticsDisplay sd = new StatisticsDisplay();
		CurrentCondidtionDisplay ccd = new CurrentCondidtionDisplay();
		
		WeatherData wd = new WeatherData();
		wd.registerObserver(sd);
		wd.registerObserver(ccd);
		
		wd.setMeasurements(10.5f, 2.1f, 1.4f);
		
		System.out.println("\nQuitamos a statistics display del observer\n");
		wd.unregisterObserver(sd);
		
		
		wd.setMeasurements(11.5f, 1.1f, 0.4f);

		System.out.println("\nAgregamos heat index display al observer\n");
		wd.registerObserver(new HeatIndexDisplay());
		
		wd.setMeasurements(3.5f, 4.0f, 2.4f);

	}

}

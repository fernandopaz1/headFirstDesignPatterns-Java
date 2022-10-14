package c2_The_Observer_pattern.weather_monitoring_app;

public class Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentCondidtionDisplay ccd = new CurrentCondidtionDisplay();
		StatisticsDisplay sd = new StatisticsDisplay();
		
		wd.setCurrentConditionDisplay(ccd);
		wd.setStatisticsDisplay(sd);
		
		wd.setTemperature(10.0f);
		wd.setHumidity(2.1f);
		wd.setPressure(0.9f);
	}

}

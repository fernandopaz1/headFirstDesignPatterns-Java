package c2_The_Observer_pattern.weather_monitoring_app;

public interface Display {
	void update(float temperature, float humidity, float pressure);
	void display();
}

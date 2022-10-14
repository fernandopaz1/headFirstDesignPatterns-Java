package c2_The_Observer_pattern.observer.display;

import c2_The_Observer_pattern.observer.interfaces.Observer;

public interface Display {
	void display(float temperature, float humidity, float pressure);
}

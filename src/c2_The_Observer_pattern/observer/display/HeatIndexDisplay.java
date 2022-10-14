package c2_The_Observer_pattern.observer.display;

import c2_The_Observer_pattern.observer.interfaces.Observer;
import lombok.Data;

@Data
public class HeatIndexDisplay implements Observer, Display {

	private static final String CURRENT_CONDITION_MSG = "Heat Index display:  %.2f";

	@Override
	public void update(float temperature, float humidity, float pressure) {
		display(temperature, humidity, pressure);
	}

	@Override
	public void display(float temperature, float humidity, float pressure) {
		System.out.println("-".repeat(10) + "Heat Index Display" + "-".repeat(10));
		System.out.println(String.format(CURRENT_CONDITION_MSG, computeHeatIndex(temperature, humidity)));
		System.out.println("-".repeat(30) + "\n");
	}

	 private float computeHeatIndex(float t, float rh) {
	        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
	            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
	            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
	            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
	            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
	            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
	            0.000000000843296 * (t * t * rh * rh * rh)) -
	            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
	        return index;
	    }

}

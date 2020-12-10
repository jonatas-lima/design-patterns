package observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

	private List<Double> temperatures;
	private Observable weatherData;
	
	public StatisticsDisplay(Observable weatherData) {
		this.temperatures = new ArrayList<Double>();
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}
	
	private double maxTemperature() {
		return Collections.max(this.temperatures);
	}
	
	private double minTemperature() {
		return Collections.min(this.temperatures);
	}
	
	private double avgTemperature() {
		return (this.temperatures.stream().reduce(0.0, (t1, t2) -> t1 + t2) / this.temperatures.size());
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min = " + avgTemperature() + "/" + maxTemperature() + "/" + minTemperature());
	}

	@Override
	public void update(Double temperature, Double humidity, Double pressure) {
		this.temperatures.add(temperature);
		
		display();
	}

}

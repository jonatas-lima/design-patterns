package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

	private Double temperature;
	private Double humidity;
	private Double pressure;
	
	private List<Observer> observers;
	
	public WeatherData() {
		this.temperature = null;
		this.humidity = null;
		this.pressure = null;
		this.observers = new ArrayList<Observer>();
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}
	
	@Override
	public void addObserver(Observer obs) {
		this.observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		try {
			this.observers.remove(this.observers.indexOf(obs));
		} catch (IndexOutOfBoundsException e) {
			
		}
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.update(temperature, humidity, pressure));
	}

	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(Double temperature, Double humidity, Double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
}

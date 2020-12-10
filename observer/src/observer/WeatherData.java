package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

	private Double temperature;
	private Double humidity;
	
	private List<Observer> observers;
	
	public WeatherData() {
		this.temperature = null;
		this.humidity = null;
		this.observers = new ArrayList<Observer>();
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
		this.observers.forEach(o -> o.update(temperature, humidity));
	}

	private void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(Double temperature, Double humidity, Double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		measurementsChanged();
	}
}

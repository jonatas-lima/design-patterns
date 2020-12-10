package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature;
	private double humidity;
	private Observable weatherData;
	
	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		this.weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " celsius degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Double temperature, Double humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		
		display();
	}

}

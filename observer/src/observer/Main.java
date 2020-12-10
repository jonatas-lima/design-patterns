package observer;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		// cada vez que os dados do tempo forem atualizados, os observadores serão notificados
		weatherData.setMeasurements(80.0, 65.0, 30.4);
		weatherData.setMeasurements(82.0, 70.0, 29.2);
		weatherData.setMeasurements(78.0, 90.0, 29.2);
		
		// o objeto currentDisplay não é mais um observador
		weatherData.removeObserver(currentDisplay);
		
		// agora só o StatisticsDisplay será notificado
		weatherData.setMeasurements(86.0, 80.0, 30.2);
	}

}

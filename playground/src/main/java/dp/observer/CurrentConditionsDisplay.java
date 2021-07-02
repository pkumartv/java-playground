package dp.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
	Observable observable;
	private float temperature;
	private float humidity;
	
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
		
	}
	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData){
			WeatherData weatherData=(WeatherData) obs;
			this.temperature=weatherData.getTemparature();
			this.humidity=weatherData.getHumidity();
			display();
			
		}
	}
		
	public void display(){
		System.out.println("temp:"+this.temperature+" humidity: "+this.humidity);
	}

}

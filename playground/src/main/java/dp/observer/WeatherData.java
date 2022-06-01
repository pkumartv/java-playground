//package dp.observer;
//
//import java.util.Observable;
//
//public class WeatherData extends Observable {
//	private float temparature;
//	private float humidity;
//	private float pressure;
//
//	public float getTemparature() {
//		return temparature;
//	}
//
//	public float getHumidity() {
//		return humidity;
//	}
//
//	public float getPressure() {
//		return pressure;
//	}
//
//	public WeatherData(){
//
//	}
//
//	public void measurementsChanged(){
//		setChanged();
//		notifyObservers(); //PULL model
//	}
//}

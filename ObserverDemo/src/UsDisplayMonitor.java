import java.util.Observable;
import java.util.Observer;

public class UsDisplayMonitor implements Observer {

	@Override
	public void update(Observable o, Object data) {
		if (data instanceof WeatherData) {
			WeatherData mData = (WeatherData) data;
			System.out.println("=== This is monitor :" + this.getClass() + " ===");
			System.out.println("Weather condition from : " + o.getClass());
			System.out.println("Current temprature is : " + mData.get_temprature());
			System.out.println("Current wind level is : " + mData.get_windLevel());
		}
	}

}

import java.util.Observable;

public class WeatherStation extends Observable {
	WeatherData _data;
	
	public WeatherStation(WeatherData data)
	{
		_data = data;
	}
	
	public void setData(WeatherData data)
	{
		_data = data;
		setChanged();
		onValueChange();
		
	}
	
	public void onValueChange()
	{
		this.notifyObservers(_data);
		this.clearChanged();
	}
	
}

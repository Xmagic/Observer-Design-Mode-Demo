
public class RunDemo {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation(new WeatherData("42", "9"));
		// Add observers to this station
		station.addObserver(new ChinaDisplayMonitor());
		station.addObserver(new UsDisplayMonitor());
		// On data changed
		station.setData(new WeatherData("-30", "5"));
	}
}

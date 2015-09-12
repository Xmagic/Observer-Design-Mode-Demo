
public class WeatherData {
	private String _temprature;
	private String _windLevel;

	public WeatherData(String temprature, String windLevel) {
		set_temprature(temprature);
		set_windLevel(windLevel);
	}

	public String get_windLevel() {
		return _windLevel;
	}

	public void set_windLevel(String _windLevel) {
		this._windLevel = _windLevel;
	}

	public String get_temprature() {
		return _temprature;
	}

	public void set_temprature(String _temprature) {
		this._temprature = _temprature;
	}

}

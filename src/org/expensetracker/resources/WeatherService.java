package org.expensetracker.resources;

import java.io.IOException;

import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author ankurshrivastava Service class for fetching the data from
 *         openweathermap.org.
 *
 */
public class WeatherService {

	public WeatherService() {
		super();
	}

	private WeatherClient weatherClient = new WeatherClient();

	public WeatherService(WeatherClient weatherClient) {
		this.weatherClient = weatherClient;
	}

	public String getWeatherInfo(String city) throws IOException, JSONException {

		//AppConfig ac = new AppConfig();
		WeatherAPIRequest req = new WeatherAPIRequest("http://api.openweathermap.org/data/2.5/weather",
				"e3c9e296ad1fbea5a28f9adfd906ef2d", city, "imperial", "GET");
		Response res = weatherClient.executeRequest(req);

		StringBuilder sb = new StringBuilder();

		if (res.getStatus() == 200) {
			JSONObject json = new JSONObject(res.readEntity(String.class));
			JSONObject resultObject = json.getJSONObject("main");
			Double temp = resultObject.getDouble("temp");
			String cityName = city;
			int i = cityName.indexOf(' ');
			if (i > 0)
				cityName = cityName.substring(0, i);
			sb.append(cityName + " weather: ");
			sb.append(System.getProperty("line.separator"));
			sb.append(temp + " degree Fahrenheit");
		} else {
			sb.append("entered city :" + city + " not found ");
		}
		return sb.toString();
	}

}

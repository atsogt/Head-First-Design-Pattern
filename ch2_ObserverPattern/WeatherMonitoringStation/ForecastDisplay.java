
/**
 * Write a description of class ForecastDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForecastDisplay implements Display, Observer
{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void display() {
        System.out.println("Forecast conditions: " + temperature 
                + "F degrees and " + humidity + "% humidity"); 
    }
    
    // public void update(float temp, float humidity, float pressure) {
        // this.temperature = temp;
        // this.humidity = humidity;
        // display();
    // }
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}

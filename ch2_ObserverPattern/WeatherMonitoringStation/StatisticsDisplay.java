
/**
 * Write a description of class StatisticsDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StatisticsDisplay implements Display, Observer
{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void display() {
        System.out.println("Statistics Display: " + temperature 
                + "F degrees and " + humidity + "% humidity"); 
    }
    
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    // public void update(float temp, float humidity, float pressure) {
        // this.temperature = temp;
        // this.humidity = humidity;
        // this.pressure = pressure;
        // display();
    // }
}

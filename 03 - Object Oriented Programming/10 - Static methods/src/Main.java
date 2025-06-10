public class Main {
    public static void main(String[] args) {
        float fahrenheit = TemperatureConverter.celsiusToFahrenheit(22);
        System.out.println(fahrenheit);
        float celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius);
    }
}
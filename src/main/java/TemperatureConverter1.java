public class TemperatureConverter1 {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }


    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter1 converter = new TemperatureConverter1();


        double tempF = 98.6;
        double tempC = converter.fahrenheitToCelsius(tempF);
        System.out.println(tempF + " Fahrenheit on " + tempC + " Celsius");


        tempC = 37.0;
        tempF = converter.celsiusToFahrenheit(tempC);
        System.out.println(tempC + " Celsius on " + tempF + " Fahrenheit");


        System.out.println("is 60°C extreme temperature? " + converter.isExtremeTemperature(60));
        System.out.println("is -50°C extreme temperature? " + converter.isExtremeTemperature(-50));
    }
}

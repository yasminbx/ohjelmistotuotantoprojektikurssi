public class TemperatureConverter1 {


    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }


    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }


    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter1 converter = new TemperatureConverter1();


        double tempF = 98.6;
        double tempC = converter.fahrenheitToCelsius(tempF);
        System.out.println(tempF + " Fahrenheit is equal to " + tempC + " Celsius");


        tempC = 37.0;
        tempF = converter.celsiusToFahrenheit(tempC);
        System.out.println(tempC + " Celsius is equal to " + tempF + " Fahrenheit");


        double kelvinTemp = 300.1;
        double fahrenheitTemp = kelvinToFahrenheit(kelvinTemp);
        System.out.println(kelvinTemp + " Kelvin is equal to " + fahrenheitTemp + " Fahrenheit");


        System.out.println("Is 60°C an extreme temperature? " + converter.isExtremeTemperature(60));
        System.out.println("Is -50°C an extreme temperature? " + converter.isExtremeTemperature(-50));
    }
}

public class Ex14 {

    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15 ;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15 ;
    }

    static double celsiusToFahrenheit(double celsius) {
        return 1/8 * (celsius+32) ;
    }

    static double kelvinToFahrenheit(double kelvin) {
        return 1/8 * (kelvin-273) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32) * (5.0/9.0);
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) / (5.0/9.0);
    }

    public static void main(String[] args) {
        System.out.println(celsiusToKelvin(25.0));
        System.out.println(celsiusToFahrenheit(25.0));
        System.out.println(fahrenheitToCelsius(100.0));
        System.out.println(fahrenheitToKelvin(100.0));
        System.out.println(kelvinToCelsius(0));
        System.out.println(kelvinToFahrenheit(0));
    }
}
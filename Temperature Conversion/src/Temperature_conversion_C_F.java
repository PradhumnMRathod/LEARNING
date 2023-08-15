
	
	import java.util.Scanner;

	public class Temperature_conversion_C_F{

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Welcome to the Temperature Conversion Tool!");
	        System.out.println("Select an option");
	        System.out.println("1. Convert Celsius to Fahrenheit");
	        System.out.println("2. Convert Fahrenheit to Celsius");
	        System.out.println("Enter your choice: ");
	        
	        int i = scan.nextInt();
            double temperature ;
	        switch (i) {
	            case 1:
	                System.out.println("Convert Celsius to Fahrenheit");
	                System.out.println("Enter the temperature in Celsius:");
	                temperature = scan.nextDouble();

	                TemperatureConversion converter1 = new TemperatureConversion();
	                double tempFahrenheit = converter1.celsiusToFahrenheit(temperature);
	                System.out.println("Enter the temperature in Fahrenheit: " + tempFahrenheit);
	                break;

	            case 2:
	                System.out.println("Convert Fahrenheit to Celsius");
	                System.out.println("Enter the temperature in Fahrenheit:");
	                temperature = scan.nextDouble();

	                TemperatureConversion converter2 = new TemperatureConversion();
	                double tempCelsius = converter2.fahrenheitToCelsius(temperature);
	                System.out.println("Enter the temperature in Celsius: " + tempCelsius);
	                break;

	            default:
	                System.out.println("Invalid choice. ");
	                break;
	        }
	    }
	}

	class TemperatureConversion {
	  
	    public static double celsiusToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static double fahrenheitToCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5 / 9;
	    }
	}


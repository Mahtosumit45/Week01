import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu options for the user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = takeInput(scanner);

        // Perform the conversion based on user choice
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = takeInput(scanner);
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = takeInput(scanner);
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice! Please choose 1 or 2.");
        }

        scanner.close();
    }

    // Function to take input from the user
    private static double takeInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid temperature:");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }

    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

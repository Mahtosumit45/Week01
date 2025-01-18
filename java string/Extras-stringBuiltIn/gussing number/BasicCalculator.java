import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Displaying the menu of operations
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Taking two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextInt();

        // Perform the operation based on user choice
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);

        scanner.close();
    }

    // Function to take input from the user
    private static double takeInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }

    // Function to perform addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Function to perform subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Function to perform multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Function to perform division
    private static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Returning NaN to indicate an error
        }
        return a / b;
    }
}

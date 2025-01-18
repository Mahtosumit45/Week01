import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a non-negative integer to calculate its factorial:");
        int number = takeInput(scanner);

        // Calculating the factorial
        long factorial = calculateFactorial(number);

        // Displaying the result
        displayResult(number, factorial);

        scanner.close();
    }

    // Function to take input from the user
    private static int takeInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative integer:");
            scanner.next(); // Clear invalid input
        }
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please try again.");
            return takeInput(scanner); // Recursive call for valid input
        }
        return input;
    }

    // Recursive function to calculate the factorial of a number
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive call
    }

    // Function to display the result
    private static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

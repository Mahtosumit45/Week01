import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int numTerms = takeInput(scanner);

        // Generating and displaying the Fibonacci sequence
        generateFibonacci(numTerms);

        scanner.close();
    }

    // Function to take input from the user
    private static int takeInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer:");
            scanner.next(); // Clear invalid input
        }
        int input = scanner.nextInt();
        if (input < 1) {
            System.out.println("Number of terms must be at least 1. Please try again.");
            return takeInput(scanner); // Recursive call for valid input
        }
        return input;
    }

    // Function to generate and print the Fibonacci sequence
    private static void generateFibonacci(int numTerms) {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence up to " + numTerms + " terms:");

        for (int i = 1; i <= numTerms; i++) {
            System.out.print(first + " ");
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after the sequence
    }
}

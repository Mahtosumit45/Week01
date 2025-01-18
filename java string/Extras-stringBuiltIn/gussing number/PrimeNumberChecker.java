import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a number to check if it is prime:");
        int number = takeInput(scanner);

        // Checking if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Displaying the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Function to take input from the user
    private static int takeInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        return true; // No divisors found, number is prime
    }
}

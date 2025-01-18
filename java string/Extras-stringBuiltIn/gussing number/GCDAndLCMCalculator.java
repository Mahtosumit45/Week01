import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two numbers from the user
        System.out.println("Enter the first number:");
        int num1 = takeInput(scanner);
        System.out.println("Enter the second number:");
        int num2 = takeInput(scanner);

        // Calculating GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Displaying the results
        displayResult(gcd, lcm);

        scanner.close();
    }

    // Function to take input from the user
    private static int takeInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer:");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    // Function to calculate GCD (Greatest Common Divisor) using Euclidean Algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM (Least Common Multiple) using the formula:
    // LCM(a, b) = (a * b) / GCD(a, b)
    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the results
    private static void displayResult(int gcd, int lcm) {
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
    }
}

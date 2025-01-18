import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking three inputs from the user
        System.out.println("Enter the first number:");
        int num1 = takeInput(scanner);

        System.out.println("Enter the second number:");
        int num2 = takeInput(scanner);

        System.out.println("Enter the third number:");
        int num3 = takeInput(scanner);

        // Finding the maximum value
        int max = findMaximum(num1, num2, num3);

        // Displaying the result
        System.out.println("The maximum of the three numbers is: " + max);

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

    // Function to find the maximum of three numbers
    private static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

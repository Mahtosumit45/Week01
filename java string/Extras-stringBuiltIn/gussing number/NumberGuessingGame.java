import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100 (inclusive), and I will try to guess it!");
        System.out.println("Provide feedback for each guess: 'high', 'low', or 'correct'.");

        int lowerBound = 1;
        int upperBound = 100;
        boolean isCorrect = false;

        while (!isCorrect) {
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);

            System.out.print("Is my guess 'high', 'low', or 'correct'? ");
            String feedback = scanner.nextLine().trim().toLowerCase();

            switch (feedback) {
                case "high":
                    upperBound = guess - 1; // Narrow the range
                    break;
                case "low":
                    lowerBound = guess + 1; // Narrow the range
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number: " + guess);
                    isCorrect = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }

            if (lowerBound > upperBound) {
                System.out.println("Hmm, something went wrong! Did you change your number?");
                break;
            }
        }

        scanner.close();
    }

    // Function to generate a guess
    private static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}

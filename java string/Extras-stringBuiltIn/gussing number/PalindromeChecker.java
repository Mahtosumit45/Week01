import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputString = takeInput(scanner);

        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Displaying the result
        displayResult(inputString, isPalindrome);

        scanner.close();
    }

    // Function to take input from the user
    private static String takeInput(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    // Function to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        // Removing non-alphanumeric characters and converting to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Checking if the string reads the same forward and backward
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    private static void displayResult(String original, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }
    }
}

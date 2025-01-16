import java.util.Scanner;

public class PalindromeCheckers {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int end = text.length() - 1;

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(end--);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String input = sc.nextLine().trim().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Normalize input

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Logic 3 (Using Arrays): " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}


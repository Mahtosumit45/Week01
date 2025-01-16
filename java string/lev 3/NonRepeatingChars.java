import java.util.Scanner;

public class NonRepeatingChars {
    public static char nonRepeating(String s) {
        int[] arr = new int[256]; // Adjusted to 256
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch]++; // Increment frequency of the character
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine().trim(); // Accept full lines instead of just a single word
        char nonRepeating = nonRepeating(s);
        if (nonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + nonRepeating);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
